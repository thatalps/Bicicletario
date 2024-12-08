package com.trabalho.bicicletario.service;

import com.trabalho.bicicletario.dto.NovaCobrancaDTO;
import com.trabalho.bicicletario.model.Cobranca;
import com.trabalho.bicicletario.model.StatusCobranca;
import com.trabalho.bicicletario.repository.CartaoDeCreditoRepository;
import com.trabalho.bicicletario.repository.CobrancaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CobrancaService {
    private final CobrancaRepository cobrancaRepository;
    private final CartaoDeCreditoRepository cartaoDeCreditoRepository;

    public CobrancaService(CobrancaRepository cobrancaRepository, CartaoDeCreditoRepository cartaoDeCreditoRepository   ) {
        this.cobrancaRepository = cobrancaRepository;
        this.cartaoDeCreditoRepository = cartaoDeCreditoRepository;
    }

    //Realiza cobranças
    public Cobranca cobranca(NovaCobrancaDTO NovaCobrancaDTO) {
        Cobranca cobranca = new Cobranca();
        cobranca.setStatus(StatusCobranca.PENDENTE);
        cobranca.setHoraSolicitacao(LocalDateTime.now());
        cobranca.setValor(NovaCobrancaDTO.getValor());
        cobranca.setCiclista(NovaCobrancaDTO.getCiclista());
        return cobrancaRepository.save(cobranca);
    }

    //Retorna cobrança por ID
    public Cobranca cobranca(Long id) {
        try {
            return cobrancaRepository.findById(id).orElseThrow(() -> new Exception());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    //Chama as cobranças pendentes do banco
    public List<Cobranca> filaCobranca() {
        List<StatusCobranca> status = List.of(StatusCobranca.PENDENTE, StatusCobranca.FALHA);
        return cobrancaRepository.findByStatusIn(status);
    }

    public List<Cobranca> processaCobrancasEmFila() {
        List<Cobranca> cobrancas = filaCobranca();
        cobrancas.forEach(cobranca -> cobranca.setStatus(StatusCobranca.PAGA));
        return cobrancas;
    }

    //public void validaCartaoDeCredito(CartaoDeCreditoDTO cartaoDeCreditoDTO) {}

}

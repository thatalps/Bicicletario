package com.trabalho.bicicletario.service;

import com.trabalho.bicicletario.dto.CadastrarCiclistaDTO;
import com.trabalho.bicicletario.model.Ciclista;
import com.trabalho.bicicletario.repository.CartaoRepository;
import com.trabalho.bicicletario.repository.CiclistaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public class CadastrarCiclistaService {
    public ResponseEntity<Ciclista> cadastrar(@RequestBody CadastrarCiclistaDTO ciclistaDTO) {
        CiclistaRepository ciclistaRepository = new CiclistaRepository();
        CartaoRepository cartaoRepository = new CartaoRepository();
        ResponseEntity<Ciclista> ciclistaResponse = ciclistaRepository.cadastrar( ciclistaDTO.ciclista );
        ResponseEntity<Void> cartaoResponse = cartaoRepository.cadastrar( ciclistaDTO.meioDePagamento );

        if(ciclistaResponse.getStatusCode() != HttpStatus.CREATED || cartaoResponse.getStatusCode() != HttpStatus.CREATED) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(ciclistaResponse.getBody());
    }
}

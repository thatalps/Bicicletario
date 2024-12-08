package com.trabalho.bicicletario.dto;

import com.trabalho.bicicletario.model.StatusCobranca;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class CobrancaDTO {
    private int id;
    private StatusCobranca status;
    private LocalDateTime horaSolicitacao;
    private LocalDateTime horaFinalizacao;
    private double valor;
    private int ciclista;

}

package com.trabalho.bicicletario.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Cobranca {
    @Id
    private Integer id;

    private StatusCobranca status;

    private LocalDateTime horaSolicitacao;

    private LocalDateTime horaFinalizacao;

    private double valor;

    private int ciclista;

}
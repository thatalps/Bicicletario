package com.trabalho.bicicletario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Cartao {
    @Id
    private Long id;

    @Getter @Setter
    private String nomeTitular;

    @Getter @Setter
    private String numero;

    @Getter @Setter
    private String validade;

    @Getter @Setter
    private String cvv;
}

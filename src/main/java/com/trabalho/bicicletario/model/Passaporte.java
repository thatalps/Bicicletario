package com.trabalho.bicicletario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Passaporte {
    @Id
    private Long id;

    @Getter @Setter
    private String numero;

    @Getter @Setter
    private String validade;

    @Getter @Setter
    private String pais;
}

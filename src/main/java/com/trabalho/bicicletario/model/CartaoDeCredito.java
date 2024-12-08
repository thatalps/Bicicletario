package com.trabalho.bicicletario.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
public class CartaoDeCredito {
    @Id
    private String numero;

    private String titular;

    private LocalDate validade;

    private String cvv;
}

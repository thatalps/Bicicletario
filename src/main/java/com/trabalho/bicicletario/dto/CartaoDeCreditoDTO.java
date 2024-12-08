package com.trabalho.bicicletario.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class CartaoDeCreditoDTO {
    private String nomeTitular;
    private String numero;
    private LocalDate validade;
    private String cvv;
}

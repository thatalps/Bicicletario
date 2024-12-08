package com.trabalho.bicicletario.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Ciclista {
    @Id
    private Long id;

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String nascimento;

    @Getter @Setter
    private String cpf;

    @Getter @Setter
    @OneToOne
    private Passaporte passaporte;

    @Getter @Setter
    private String nacionalidade;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private String urlFotoDocumento;

    @Getter @Setter
    private String senha;

    @Getter @Setter @Nullable
    private String status;
}

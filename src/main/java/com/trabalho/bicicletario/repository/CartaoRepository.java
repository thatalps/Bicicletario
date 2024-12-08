package com.trabalho.bicicletario.repository;

import com.trabalho.bicicletario.model.Cartao;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CartaoRepository {
    public ResponseEntity<Void> cadastrar(Cartao cartao) {
        // TODO
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}

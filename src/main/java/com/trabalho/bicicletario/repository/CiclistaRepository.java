package com.trabalho.bicicletario.repository;

import com.trabalho.bicicletario.model.Ciclista;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public class CiclistaRepository {
    public ResponseEntity<Ciclista> cadastrar(Ciclista ciclista) {
        // TODO
        Ciclista newCiclista = new Ciclista();
        return ResponseEntity.status(HttpStatus.CREATED).body(newCiclista);
    }
}

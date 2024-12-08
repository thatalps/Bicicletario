package com.trabalho.bicicletario.controller;

import com.trabalho.bicicletario.dto.CadastrarCiclistaDTO;
import com.trabalho.bicicletario.model.Ciclista;
import com.trabalho.bicicletario.service.CadastrarCiclistaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/ciclista")
public class CiclistaController {

    @PostMapping("")
    public ResponseEntity<Ciclista> cadastrar(@RequestBody CadastrarCiclistaDTO ciclistaDTO) {
        CadastrarCiclistaService cadastrarCiclistaService = new CadastrarCiclistaService();
        ResponseEntity<Ciclista> response = cadastrarCiclistaService.cadastrar(ciclistaDTO);

        if(response.getStatusCode() != HttpStatus.CREATED) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
    }
}

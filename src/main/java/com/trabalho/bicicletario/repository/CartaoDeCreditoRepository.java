package com.trabalho.bicicletario.repository;

import com.trabalho.bicicletario.model.CartaoDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoDeCreditoRepository extends JpaRepository<CartaoDeCredito, String>{
}

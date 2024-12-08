package com.trabalho.bicicletario.repository;

import com.trabalho.bicicletario.model.Cobranca;
import com.trabalho.bicicletario.model.StatusCobranca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CobrancaRepository extends JpaRepository<Cobranca, Long> {
    List<Cobranca> findByStatusIn(List<StatusCobranca> status);
}

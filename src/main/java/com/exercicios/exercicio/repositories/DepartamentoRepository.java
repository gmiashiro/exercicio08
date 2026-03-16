package com.exercicios.exercicio.repositories;

import com.exercicios.exercicio.model.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}

package com.exercicios.exercicio.services;

import com.exercicios.exercicio.model.DepartamentoModel;
import com.exercicios.exercicio.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public DepartamentoModel criarDepartamento(DepartamentoModel departamento) {
        return departamentoRepository.save(departamento);
    }

    public void deletarDepartamento(Long id) {
        departamentoRepository.deleteById(id);
    }

    public List<DepartamentoModel> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    public DepartamentoModel findDepartamentoById(Long id) {
        return departamentoRepository.findById(id).orElse(null);
    }
}

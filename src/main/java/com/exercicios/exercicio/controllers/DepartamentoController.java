package com.exercicios.exercicio.controllers;

import com.exercicios.exercicio.model.DepartamentoModel;
import com.exercicios.exercicio.services.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @PostMapping
    public DepartamentoModel salvarDepartamento(@RequestBody DepartamentoModel departamentoModel) {
        return departamentoService.criarDepartamento(departamentoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarDepartamento(@PathVariable Long id) {
        departamentoService.deletarDepartamento(id);
    }

    @GetMapping
    public List<DepartamentoModel> listarDepartamentos() {
        return departamentoService.listarDepartamentos();
    }

    @GetMapping("/{id}")
    public DepartamentoModel buscarDepartamento(@PathVariable Long id) {
        return departamentoService.findDepartamentoById(id);
    }
}

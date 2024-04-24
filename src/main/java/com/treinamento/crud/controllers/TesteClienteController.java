package com.treinamento.crud.controllers;

import com.treinamento.crud.model.entity.TesteCliente;
import com.treinamento.crud.services.TesteClienteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("cliente")
@AllArgsConstructor
public class TesteClienteController {
    private TesteClienteService testeClienteService;

    @GetMapping
    public List<TesteCliente> getCliente(){
        return testeClienteService.findCliente();
    }
}

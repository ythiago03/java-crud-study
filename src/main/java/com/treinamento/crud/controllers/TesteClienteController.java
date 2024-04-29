package com.treinamento.crud.controllers;

import com.treinamento.crud.model.dto.ClienteDTO;
import com.treinamento.crud.model.entity.TesteCliente;
import com.treinamento.crud.services.TesteClienteService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void postCliente(@RequestBody ClienteDTO dto){
        testeClienteService.cadastrarCliente(dto);
    }

    @PutMapping
    @Transactional
    public void putCliente(@RequestBody ClienteDTO dto){
        testeClienteService.atualizarCliente(dto);
    }

    @DeleteMapping("{cpf}")
    @Transactional
    public void deleteCliente(@PathVariable String cpf){
        testeClienteService.deletarCliente(cpf);
    }
}

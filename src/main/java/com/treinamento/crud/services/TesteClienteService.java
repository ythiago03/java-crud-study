package com.treinamento.crud.services;

import com.treinamento.crud.model.entity.TesteCliente;
import com.treinamento.crud.repository.TesteClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TesteClienteService {

    private TesteClienteRepository testeClienteRepository;

    public List<TesteCliente> findCliente(){
        return testeClienteRepository.findAll();
    }
}

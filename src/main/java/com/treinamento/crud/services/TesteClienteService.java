package com.treinamento.crud.services;

import com.treinamento.crud.model.dto.ClienteDTO;
import com.treinamento.crud.model.entity.TesteCliente;
import com.treinamento.crud.repository.TesteClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TesteClienteService {

    private TesteClienteRepository testeClienteRepository;

    //GET
    public List<TesteCliente> findCliente(){
        return testeClienteRepository.findAll();
    }

    //POST
    public void cadastrarCliente(ClienteDTO dto){
        TesteCliente testeCliente = new TesteCliente(dto);
        testeClienteRepository.save(testeCliente);
    }

    //PUT
    public void atualizarCliente(ClienteDTO dto){
       TesteCliente testeCliente = testeClienteRepository.getReferenceById(dto.id());
       testeCliente.update(dto);
    }

    //DELETE
    public void deletarCliente(String cpf){
        testeClienteRepository.deleteByCpf(cpf);
    }
}

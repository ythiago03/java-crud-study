package com.treinamento.crud.repository;

import com.treinamento.crud.model.entity.TesteCliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TesteClienteRepository extends JpaRepository<TesteCliente, Long> {
    Long deleteByCpf(String cpf);
}

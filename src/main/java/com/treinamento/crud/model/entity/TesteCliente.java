package com.treinamento.crud.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "testecliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TesteCliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(length =11)
        private String cpf;

        @Column(length = 50)
        private String name;

        @Column(length = 50)
        private String email;

}

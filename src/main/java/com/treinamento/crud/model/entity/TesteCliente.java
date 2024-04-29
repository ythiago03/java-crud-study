package com.treinamento.crud.model.entity;

import com.treinamento.crud.model.dto.ClienteDTO;
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


        public TesteCliente(ClienteDTO dto){
                this.name = dto.name();
                this.cpf = dto.cpf();
                this.email = dto.email();
        }

        public void update(ClienteDTO dto){
                if(dto.name() != null){
                        this.name = dto.name();
                }
                if(dto.cpf() != null){
                        this.cpf = dto.cpf();
                }
                if(dto.email() != null){
                        this.email = dto.email();
                }

        }
}

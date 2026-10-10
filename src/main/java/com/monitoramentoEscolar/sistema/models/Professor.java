package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "professores")
@EqualsAndHashCode(exclude = {"atribuicoes"})
public class Professores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String formacao;                // Ex: "Licenciatura em Matemática"
    private String status;          // Ex: "Ativo", "Inativo", "Afastado", "Aposentado"

    @OneToMany(mappedBy = "professor")
    private List<AtribuicaoAula> atribuicoes = new ArrayList<>();
}

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
@Table(name = "disciplinas")
@EqualsAndHashCode(exclude = {"atribuicoes", "notas", "desempenhos"})
public class Disciplinas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "disciplina")
    private List<AtribuicaoAula> atribuicoes = new ArrayList<>();

    @OneToMany(mappedBy = "disciplina")
    private List<Nota> notas = new ArrayList<>();

    @OneToMany(mappedBy = "disciplina")
    private List<Desempenho> desempenhos = new ArrayList<>();


}

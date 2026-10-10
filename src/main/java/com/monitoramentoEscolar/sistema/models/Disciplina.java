package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da disciplina é obrigatório")
    @Column(nullable = false)
    private String nome;

    @NotBlank(message = "O código da disciplina é obrigatório")
    @Column(nullable = false, unique = true)
    private String codigo;

    @Column(nullable = true, length = 500)
    private String descricao;

    @OneToMany(mappedBy = "disciplina")
    private List<AtribuicaoAula> atribuicoes = new ArrayList<>();

    @OneToMany(mappedBy = "disciplina")
    private List<Nota> notas = new ArrayList<>();

    @OneToMany(mappedBy = "disciplina")
    private List<Desempenho> desempenhos = new ArrayList<>();


}

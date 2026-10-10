package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
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
@Table(name = "turmas")
@EqualsAndHashCode(exclude = {"matriculas", "atribuicoes", "notas", "frequencias", "comportamentos", "desempenhos"})
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome da turma é obrigatório")
    @Column(nullable = false)
    private String nome;              // Ex: "5º A", "6º B", "1º EM"

    @NotBlank(message = "A série da turma é obrigatória")
    @Column(nullable = false)
    private String serie;             // Ex: "5º Ano", "6º Ano", "1º Ano do Ensino Médio"

    @NotBlank(message = "O ano letivo da turma é obrigatório")
    @Column(nullable = false)
    private String anoLetivo;         // Ex: "2026"


    @NotBlank(message = "O turno da turma é obrigatório")
    @Column(nullable = false)
    @Pattern(regexp = "MANHA|TARDE|NOITE")
    private String turno;// MANHA, TARDE, NOITE

    @NotBlank(message = "A sala da turma é obrigatória")
    @Column(nullable = false)
    private String sala;              // Ex: "Sala 12


    @OneToMany(mappedBy = "turma")
    private List<Matricula> matriculas = new ArrayList<>();

    @OneToMany(mappedBy = "turma")
    private List<AtribuicaoAula> atribuicoes = new ArrayList<>();

    @OneToMany(mappedBy = "turma")
    private List<Nota> notas = new ArrayList<>();

    @OneToMany(mappedBy = "turma")
    private List<Frequencia> frequencias = new ArrayList<>();

    @OneToMany(mappedBy = "turma")
    private List<Comportamento> comportamentos = new ArrayList<>();

    @OneToMany(mappedBy = "turma")
    private List<Desempenho> desempenhos = new ArrayList<>();
}

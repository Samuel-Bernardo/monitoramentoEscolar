package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comportamentos")
public class Comportamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O campo alunoId é obrigatório")
    @ManyToOne(optional = false)
    @JoinColumn(name = "aluno_id" , insertable = false, updatable = false)
    private Aluno aluno;

    @NotNull(message = "O campo turmaId é obrigatório")
    @ManyToOne(optional = false)
    @JoinColumn(name = "turma_id", insertable = false, updatable = false)
    private Turma turma;

    @NotBlank(message = "O campo data é obrigatório")
    @Column(name = "data", nullable = false)
    private LocalDate data;              // Data do registro

    @NotBlank(message = "O campo tipo é obrigatório")
    @Column(name = "tipo", nullable = false)
    private String tipo;              // POSITIVO, NEGATIVO, ADVERTENCIA, ELOGIO

    @NotBlank(message = "O campo descrição é obrigatório")
    @Column(name = "descricao", nullable = false)
    private String descricao;         // Ex: "Ajudou os colegas", "Conversou muito em aula"

    @NotBlank(message = "O campo registradoPor é obrigatório")
    @Column(name = "registrado_por", nullable = false)
    private String registradoPor;     // Nome do professor ou funcionário
}

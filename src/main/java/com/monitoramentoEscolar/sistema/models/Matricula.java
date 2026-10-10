package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "matriculas")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo Ano Letivo é obrigatório")
    @Column(name = "anoLetivo", nullable = false)
    private String anoLetivo;

    @NotBlank(message = "O campo Status é obrigatório")
    @Pattern(regexp = "ATIVA|TRANSFERIDA|CANCELADA", message = "O campo Status deve ser ATIVA, TRANSFERIDA ou CANCELADA")
    @Column(name = "status", nullable = false)
    private String status;      // ATIVA, TRANSFERIDA, etc.

    @NotBlank(message = "O campo Data de Matrícula é obrigatório")
    @Column(name = "dataMatricula", nullable = false)
    private LocalDateTime dataMatricula;

    @NotNull(message = "O campo Aluno é obrigatório")
    @ManyToOne
    @JoinColumn(name = "alunoId", insertable = false, updatable = false)
    private Aluno aluno;

    @NotNull(message = "O campo Turma é obrigatório")
    @ManyToOne
    @JoinColumn(name = "turmaId", insertable = false, updatable = false)
    private Turma turma;
}

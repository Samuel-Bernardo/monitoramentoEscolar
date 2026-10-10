package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "frequencias")
public class Frequencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O ID do aluno é obrigatório")
    @ManyToOne(optional = false)
    @JoinColumn(name = "alunoId", insertable = false, updatable =false)
    private Aluno aluno;

    @NotNull(message = "O ID da turma é obrigatório")
    @ManyToOne(optional = false)
    @JoinColumn(name = "turmaId", insertable = false, updatable =false)
    private Turma turma;

    @NotBlank(message = "A data da frequência é obrigatória")
    @Column(nullable = false)
    private LocalDate data;              // Ex: "10/03/2026"

    @NotBlank(message = "O status da frequência é) obrigatório")
    @Pattern(regexp = "PRESENTE|AUSENTE|JUSTIFICADO")
    @Column(nullable = false)
    private String status;            // PRESENTE, FALTA, JUSTIFICADA, ATRASADO

    @NotBlank(message = "A observação da frequência é obrigatória")
    @Column(nullable = false)
    private String observacao;        // Ex: "Atestado médico"
}

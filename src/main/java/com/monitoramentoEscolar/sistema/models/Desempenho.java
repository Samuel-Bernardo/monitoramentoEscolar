package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "desempenhos")
public class Desempenho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotNull(message = "O aluno é obrigatório")
    @ManyToOne(optional = false)
    @JoinColumn(name = "alunoId", insertable = false, updatable = false)
    private Aluno aluno;

    @NotNull(message = "A turma é obrigatória")
    @ManyToOne(optional = false)
    @JoinColumn(name = "turmaId", insertable = false, updatable = false)
    private Turma turma;

    @ManyToOne
    @JoinColumn(name = "disciplinaId", insertable = false, updatable = false)
    private Disciplina disciplina;

    @NotBlank(message = "O bimestre é obrigatório")
    @Column(name = "bimestre", nullable = false)
    private String bimestre;// 1º, 2º, 3º, 4º ou ANUAL

    @NotBlank(message = "O ano letivo é obrigatório")
    @Column(name = "anoLetivo", nullable = false)
    private String anoLetivo;         // Ex: "2026"

    @NotBlank(message = "A nota é obrigatória")
    @Column(name = "nota", nullable = false)
    @DecimalMin("0.0")
    @DecimalMax("10.0")
    private Double media;             // Média calculada ou lançada

    @NotBlank(message = "A situação é obrigatória")
    @Column(name = "situacao", nullable = false)
    private String situacao;          // APROVADO, REPROVADO, RECUPERACAO, EM_ANDAMENTO

    @NotBlank(message = "A observação é obrigatória")
    @Column(name = "observacao", nullable = false)
    private String observacao;        // Comentário do professor
}

package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
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
@Table(name = "notas")
public class Nota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O aluno é obrigatório")
    @ManyToOne
    @JoinColumn(name = "aluno_id", insertable = false, updatable = false)
    private Aluno aluno;

    @NotNull(message = "A disciplina é obrigatória")
    @ManyToOne
    @JoinColumn(name = "disciplina_id", insertable = false, updatable = false)
    private Disciplina disciplina;

    @NotNull(message = "A turma_id é obrigatória")
    @ManyToOne
    @JoinColumn(name = "turma_id", insertable = false, updatable = false)
    private Turma turma;


    @NotNull(message = "O valor da nota é obrigatório")
    @DecimalMin(value = "0.0", inclusive = true, message = "O valor da nota não pode ser negativo")
    @DecimalMax(value = "10.0", inclusive = true, message = "O valor da nota não pode ser maior que 10")
    @Column(nullable = false)
    private Double valor;

    @NotBlank(message = "O tipo da nota é obrigatório")
    @Column(length = 20, nullable = false)
    private String tipo;        // PROVA, TRABALHO, RECUPERACAO

    @NotBlank(message = "O bimestre da nota é obrigatório")
    @Column(length = 10, nullable = false)
    private String bimestre;    // 1º, 2º, 3º, 4º

    @NotNull(message = "A data é obrigatória")
    @Column(nullable = false)
    private LocalDate data;

    @Column(length = 255)
    private String observacao;


}

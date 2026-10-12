package com.monitoramentoEscolar.sistema.dtos.nota;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record NotaRequest(

        @NotNull(message = "Valor é obrigatório")
        @DecimalMin(value = "0.0", message = "Nota mínima é 0")
        @DecimalMax(value = "10.0", message = "Nota máxima é 10")
        Double valor,

        @NotBlank(message = "Tipo é obrigatório")
        String tipo,

        @NotBlank(message = "Bimestre é obrigatório")
        @Pattern(regexp = "1|2|3|4", message = "Bimestre deve ser 1, 2, 3 ou 4")
        String bimestre,

        @NotBlank(message = "Data é obrigatória")
        LocalDate data,

        String observacao,

        @NotNull(message = "Aluno é obrigatório")
        Long alunoId,

        @NotNull(message = "Disciplina é obrigatória")
        Long disciplinaId,

        @NotNull(message = "Turma é obrigatória")
        Long turmaId
) {
}

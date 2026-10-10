package com.monitoramentoEscolar.sistema.dtos.desempenho;

import jakarta.validation.constraints.*;

public record DesempenhoRequest(

        @NotBlank(message = "Bimestre é obrigatório")
        @Pattern(regexp = "1|2|3|4", message = "Bimestre deve ser 1, 2, 3 ou 4")
        String bimestre,

        @NotBlank(message = "Ano letivo é obrigatório")
        @Pattern(regexp = "\\d{4}", message = "Ano letivo deve ter 4 dígitos")
        String anoLetivo,

        @NotNull(message = "Média é obrigatória")
        @DecimalMin(value = "0.0", message = "Média mínima é 0")
        @DecimalMax(value = "10.0", message = "Média máxima é 10")
        Double media,

        @NotBlank(message = "Situação é obrigatória")
        @Pattern(regexp = "APROVADO|REPROVADO|RECUPERACAO", message = "Situação inválida")
        String situacao,

        @Size(max = 500)
        String observacao,

        @NotNull(message = "Aluno é obrigatório")
        Long alunoId,

        @NotNull(message = "Turma é obrigatória")
        Long turmaId,

        @NotNull(message = "Disciplina é obrigatória")
        Long disciplinaId
) {
}

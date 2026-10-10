package com.monitoramentoEscolar.sistema.dtos.matricula;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record MatriculaRequest(
        @NotBlank(message = "Ano letivo é obrigatório")
        @Pattern(regexp = "\\d{4}", message = "Ano letivo deve ter 4 dígitos")
        String anoLetivo,

        @NotBlank(message = "Status é obrigatório")
        @Pattern(regexp = "ATIVA|TRANCADA|CANCELADA|CONCLUIDA", message = "Status inválido")
        String status,

        @NotBlank(message = "Data da matrícula é obrigatória")
        String dataMatricula,

        @NotNull(message = "Aluno é obrigatório")
        Long alunoId,

        @NotNull(message = "Turma é obrigatória")
        Long turmaId
) {
}

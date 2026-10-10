package com.monitoramentoEscolar.sistema.dtos.atribuicaoAula;

import jakarta.validation.constraints.NotNull;

public record AtribuicaoAulaRequest(

        @NotNull(message = "Professor é obrigatório")
        Long professorId,

        @NotNull(message = "Disciplina é obrigatória")
        Long disciplinaId,

        @NotNull(message = "Turma é obrigatória")
        Long turmaId
) {
}

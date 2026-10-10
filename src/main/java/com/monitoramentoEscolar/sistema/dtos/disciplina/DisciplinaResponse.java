package com.monitoramentoEscolar.sistema.dtos.disciplina;

public record DisciplinaResponse(
        Long id,
        String nome,
        String codigo,
        String descricao
) {
}

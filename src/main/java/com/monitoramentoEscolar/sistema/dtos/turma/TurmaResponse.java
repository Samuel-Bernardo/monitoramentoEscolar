package com.monitoramentoEscolar.sistema.dtos.turma;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;

import java.util.List;

public record TurmaResponse(
        Long id,
        String nome,
        String serie,
        String anoLetivo,
        String turno,
        String sala,
        List<AlunoResumo> alunos
) {
}

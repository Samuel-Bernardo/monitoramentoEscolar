package com.monitoramentoEscolar.sistema.dtos.matricula;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;

public record MatriculaResponse(
        Long id,
        String anoLetivo,
        String status,
        String dataMatricula,
        AlunoResumo aluno,
        TurmaResumo turma
) {
}

package com.monitoramentoEscolar.sistema.dtos.atribuicaoAula;

import com.monitoramentoEscolar.sistema.dtos.disciplina.DisciplinaResumo;
import com.monitoramentoEscolar.sistema.dtos.professor.ProfessorResumo;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;

public record AtribuicaoAulaResponse(

        Long id,
        ProfessorResumo professor,
        DisciplinaResumo disciplina,
        TurmaResumo turma
) {
}

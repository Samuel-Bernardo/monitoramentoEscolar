package com.monitoramentoEscolar.sistema.dtos.desempenho;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;
import com.monitoramentoEscolar.sistema.dtos.disciplina.DisciplinaResumo;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;

public record DesempenhoResponse(

        Long id,
        String bimestre,
        String anoLetivo,
        Double media,
        String situacao,
        String observacao,
        AlunoResumo aluno,
        TurmaResumo turma,
        DisciplinaResumo disciplina
) {
}

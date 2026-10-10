package com.monitoramentoEscolar.sistema.dtos.nota;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;
import com.monitoramentoEscolar.sistema.dtos.disciplina.DisciplinaResumo;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;

public record NotaResponse(
        Long id,
        Double valor,
        String tipo,
        String bimestre,
        String data,
        String observacao,
        AlunoResumo aluno,
        DisciplinaResumo disciplina,
        TurmaResumo turma
) {
}

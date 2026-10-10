package com.monitoramentoEscolar.sistema.dtos.comportamento;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;

import java.time.LocalDate;

public record ComportamentoResponse(

        Long id,
        LocalDate data,
        String tipo,
        String descricao,
        String registradoPor,
        AlunoResumo aluno,
        TurmaResumo turma
) {
}

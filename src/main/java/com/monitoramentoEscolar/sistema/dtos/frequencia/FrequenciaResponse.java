package com.monitoramentoEscolar.sistema.dtos.frequencia;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;

public record FrequenciaResponse(
        Long id,
        String data,
        String status,
        String observacao,
        AlunoResumo aluno,
        TurmaResumo turm

) {
}

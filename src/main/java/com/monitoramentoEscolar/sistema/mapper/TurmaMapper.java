package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.turma.TurmaRequest;
import com.monitoramentoEscolar.sistema.dtos.turma.TurmaResumo;
import com.monitoramentoEscolar.sistema.models.Turma;

public class TurmaMapper {

    public Turma toEntity(TurmaRequest request) {
        Turma turma = new Turma();
        turma.setNome(request.nome());
        turma.setSerie(request.serie());
        turma.setAnoLetivo(request.anoLetivo());
        turma.setTurno(request.turno());
        turma.setSala(request.sala());
        return turma;
    }

    public void updateEntity(TurmaRequest request, Turma turma) {
        turma.setNome(request.nome());
        turma.setSerie(request.serie());
        turma.setAnoLetivo(request.anoLetivo());
        turma.setTurno(request.turno());
        turma.setSala(request.sala());
    }

    public TurmaResumo toResumo(Turma turma) {
        return new TurmaResumo(
                turma.getId(),
                turma.getNome(),
                turma.getSerie(),
                turma.getTurno()
        );
    }
}

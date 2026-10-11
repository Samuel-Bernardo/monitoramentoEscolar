package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;

public class MatriculaMapper {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    public MatriculaMapper(AlunoRepository alunoRepository, TurmaRepository turmaRepository) {
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
    }

}

package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.repository.DisciplinaRepository;
import com.monitoramentoEscolar.sistema.repository.ProfessorRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;

public class AtribuicaoAulaMapper {

    private final ProfessorRepository professorRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final TurmaRepository turmaRepository;

    public AtribuicaoAulaMapper(ProfessorRepository professorRepository,
                                DisciplinaRepository disciplinaRepository,
                                TurmaRepository turmaRepository) {
        this.professorRepository = professorRepository;
        this.disciplinaRepository = disciplinaRepository;
        this.turmaRepository = turmaRepository;
    }
}

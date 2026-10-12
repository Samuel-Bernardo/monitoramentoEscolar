package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.DisciplinaRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import org.springframework.stereotype.Component;

@Component
public class DesempenhoMapper {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;
    private final DisciplinaRepository disciplinaRepository;

    public DesempenhoMapper(AlunoRepository alunoRepository, TurmaRepository turmaRepository, DisciplinaRepository disciplinaRepository) {
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
        this.disciplinaRepository = disciplinaRepository;
    }
}

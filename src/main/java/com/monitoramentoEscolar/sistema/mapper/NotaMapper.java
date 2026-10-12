package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.DisciplinaRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import org.springframework.stereotype.Component;

@Component
public class NotaMapper {

    private final AlunoRepository alunoRepository;
    private final DisciplinaRepository disciplinaRepository;
    private final TurmaRepository turmaRepository;

    public NotaMapper(AlunoRepository alunoRepository,
                      DisciplinaRepository disciplinaRepository,
                      TurmaRepository turmaRepository) {
        this.alunoRepository = alunoRepository;
        this.disciplinaRepository = disciplinaRepository;
        this.turmaRepository = turmaRepository;
    }

}

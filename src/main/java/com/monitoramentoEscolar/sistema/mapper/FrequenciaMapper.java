package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import org.springframework.stereotype.Component;

@Component
public class FrequenciaMapper {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    public FrequenciaMapper(AlunoRepository alunoRepository, TurmaRepository turmaRepository) {
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
    }
}

package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.frequencia.FrequenciaRequest;
import com.monitoramentoEscolar.sistema.models.Aluno;
import com.monitoramentoEscolar.sistema.models.Frequencia;
import com.monitoramentoEscolar.sistema.models.Turma;
import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class FrequenciaMapper {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    public FrequenciaMapper(AlunoRepository alunoRepository, TurmaRepository turmaRepository) {
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
    }

    public Frequencia toEntity(FrequenciaRequest request){

        Frequencia frequencia = new Frequencia();

        frequencia.setData(request.data());
        frequencia.setStatus(request.status());
        frequencia.setObservacao(request.observacao());
        frequencia.setAluno(buscarAluno(request.alunoId()));
        frequencia.setTurma(buscarTurma(request.turmaId()));

        return frequencia;

    }

    private Aluno buscarAluno(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado: " + id));
    }

    private Turma buscarTurma(Long id) {
        return turmaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Turma não encontrada: " + id));
    }
}

package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.comportamento.ComportamentoRequest;
import com.monitoramentoEscolar.sistema.models.Aluno;
import com.monitoramentoEscolar.sistema.models.Comportamento;
import com.monitoramentoEscolar.sistema.models.Turma;
import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class ComportamentoMapper {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    public ComportamentoMapper(AlunoRepository alunoRepository, TurmaRepository turmaRepository) {
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
    }

    public Comportamento toEntity(ComportamentoRequest request) {
        Comportamento c = new Comportamento();

        c.setData(request.data());
        c.setTipo(request.tipo());
        c.setDescricao(request.descricao());
        c.setRegistradoPor(request.registradoPor());
        c.setAluno(BuscarAluno(request.alunoId()));
        c.setTurma(BuscarTurma(request.turmaId()));
        return c;
    }

    private Aluno BuscarAluno(Long id){
        return alunoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado" + id));
    }

    private Turma BuscarTurma(Long id){
        return turmaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Turma não encontrada" + id));
    }

    public void updateEntity (ComportamentoRequest request, Comportamento c){

    c.setRegistradoPor(request.registradoPor());
    c.setTipo(request.tipo());
    c.setDescricao(request.descricao());
    c.setData(request.data());
    c.setAluno(BuscarAluno(request.alunoId()));
    c.setTurma(BuscarTurma(request.turmaId()));
    }
}

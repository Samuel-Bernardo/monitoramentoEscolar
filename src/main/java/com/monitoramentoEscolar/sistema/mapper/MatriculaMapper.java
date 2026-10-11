package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.matricula.MatriculaRequest;
import com.monitoramentoEscolar.sistema.dtos.matricula.MatriculaResumo;
import com.monitoramentoEscolar.sistema.models.Aluno;
import com.monitoramentoEscolar.sistema.models.Matricula;
import com.monitoramentoEscolar.sistema.models.Turma;
import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import jakarta.persistence.EntityNotFoundException;

public class MatriculaMapper {

    private final AlunoRepository alunoRepository;
    private final TurmaRepository turmaRepository;

    public MatriculaMapper(AlunoRepository alunoRepository, TurmaRepository turmaRepository) {
        this.alunoRepository = alunoRepository;
        this.turmaRepository = turmaRepository;
    }

    public Matricula toEntity(MatriculaRequest request) {
        Matricula matricula = new Matricula();
        matricula.setAnoLetivo(request.anoLetivo());
        matricula.setStatus(request.status());
        matricula.setDataMatricula(request.dataMatricula());
        matricula.setAluno(buscarAluno(request.alunoId()));
        matricula.setTurma(buscarTurma(request.turmaId()));
        return matricula;
    }

    private Aluno buscarAluno(Long id) {
        return alunoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado: " + id));
    }

    private Turma buscarTurma(Long id) {
        return turmaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Turma não encontrada: " + id));
    }

    public void updateEntity(MatriculaRequest request, Matricula matricula) {
        matricula.setAnoLetivo(request.anoLetivo());
        matricula.setStatus(request.status());
        matricula.setDataMatricula(request.dataMatricula());
        matricula.setAluno(buscarAluno(request.alunoId()));
        matricula.setTurma(buscarTurma(request.turmaId()));
    }

    public MatriculaResumo toResumo(Matricula matricula) {
        if (matricula == null) return null;
        return new MatriculaResumo(
                matricula.getId(),
                matricula.getAnoLetivo(),
                matricula.getStatus());
    }
    }



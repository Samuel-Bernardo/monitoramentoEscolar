package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.atribuicaoAula.AtribuicaoAulaRequest;
import com.monitoramentoEscolar.sistema.models.AtribuicaoAula;
import com.monitoramentoEscolar.sistema.models.Disciplina;
import com.monitoramentoEscolar.sistema.models.Professor;
import com.monitoramentoEscolar.sistema.models.Turma;
import com.monitoramentoEscolar.sistema.repository.DisciplinaRepository;
import com.monitoramentoEscolar.sistema.repository.ProfessorRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import jakarta.persistence.EntityNotFoundException;

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

    public AtribuicaoAula toEntity(AtribuicaoAulaRequest request) {
        AtribuicaoAula a = new AtribuicaoAula();
        a.setProfessor(buscarProfessor(request.professorId()));
        a.setDisciplina(buscarDisciplina(request.disciplinaId()));
        a.setTurma(buscarTurma(request.turmaId()));
        return a;
    }

    private Professor buscarProfessor(Long id) {
        return professorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Professor não encontrado: " + id));
    }

    private Disciplina buscarDisciplina(Long id) {
        return disciplinaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Disciplina não encontrada: " + id));
    }

    private Turma buscarTurma(Long id) {
        return turmaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Turma não encontrada: " + id));
    }

    public void updateEntity(AtribuicaoAulaRequest request, AtribuicaoAula atribuicaoAula) {
        atribuicaoAula.setProfessor(buscarProfessor(request.professorId()));
        atribuicaoAula.setDisciplina(buscarDisciplina(request.disciplinaId()));
        atribuicaoAula.setTurma(buscarTurma(request.turmaId()));
    }
}

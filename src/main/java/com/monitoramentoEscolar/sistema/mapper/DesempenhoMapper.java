package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.desempenho.DesempenhoRequest;
import com.monitoramentoEscolar.sistema.models.Aluno;
import com.monitoramentoEscolar.sistema.models.Desempenho;
import com.monitoramentoEscolar.sistema.models.Disciplina;
import com.monitoramentoEscolar.sistema.models.Turma;
import com.monitoramentoEscolar.sistema.repository.AlunoRepository;
import com.monitoramentoEscolar.sistema.repository.DisciplinaRepository;
import com.monitoramentoEscolar.sistema.repository.TurmaRepository;
import jakarta.persistence.EntityNotFoundException;
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

    public Desempenho toEntity (DesempenhoRequest request){
        Desempenho d = new Desempenho();
        d.setBimestre(request.bimestre());
        d.setMedia(request.media());
        d.setAnoLetivo(request.anoLetivo());
        d.setObservacao(request.observacao());
        d.setSituacao(request.situacao());
        d.setAluno(BuscarAluno(request.alunoId()));
        d.setTurma(BuscarTurma(request.turmaId()));
        d.setDisciplina(BuscarDisciplina(request.disciplinaId()));
        return d;
    }

    public Aluno BuscarAluno(Long id){
        return alunoRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Aluno não encontrado" + id));
    }

    public Turma BuscarTurma(Long id){
        return turmaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Turma não encontrada" + id));
    }

    public Disciplina BuscarDisciplina(Long id){
        return disciplinaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Disciplina não encontrada" + id));
    }
}

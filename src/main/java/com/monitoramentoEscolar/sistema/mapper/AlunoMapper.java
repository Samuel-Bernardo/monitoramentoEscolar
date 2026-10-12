package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoRequest;
import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResponse;
import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoResumo;
import com.monitoramentoEscolar.sistema.dtos.comportamento.ComportamentoResumo;
import com.monitoramentoEscolar.sistema.dtos.desempenho.DesempenhoResumo;
import com.monitoramentoEscolar.sistema.dtos.frequencia.FrequenciaResumo;
import com.monitoramentoEscolar.sistema.dtos.matricula.MatriculaResumo;
import com.monitoramentoEscolar.sistema.dtos.nota.NotaResumo;
import com.monitoramentoEscolar.sistema.models.*;
import org.springframework.stereotype.Component;

@Component
public class AlunoMapper {

                // ===== Request → Entity (criar) =====
    public Aluno ToEntity(AlunoRequest request){
        Aluno aluno = new Aluno();
        aluno.setNome(request.nome());
        aluno.setCpf(request.cpf());
        aluno.setDataNascimento(request.dataNascimento());
        aluno.setEmail(request.email());
        aluno.setTelefone(request.telefone());
        aluno.setNomeResponsavel(request.nomeResponsavel());
        aluno.setTelefoneResponsavel(request.telefoneResponsavel());
        aluno.setStatus(request.status());
        return aluno;
    }

    // ===== Request → Entity existente (editar) =====
    public void updateEntity(AlunoRequest request, Aluno aluno){
        aluno.setNome(request.nome());
        aluno.setCpf(request.cpf());
        aluno.setDataNascimento(request.dataNascimento());
        aluno.setEmail(request.email());
        aluno.setTelefone(request.telefone());
        aluno.setNomeResponsavel(request.nomeResponsavel());
        aluno.setTelefoneResponsavel(request.telefoneResponsavel());
        aluno.setStatus(request.status());
    }

    public AlunoResumo toResumo(Aluno aluno){
        return new AlunoResumo(
                aluno.getId(),
                aluno.getNome()
        );
    }

    public AlunoResponse toResponde(Aluno aluno){
        if (aluno == null) {
            return null;
        }
        return new AlunoResponse(
                aluno.getId(),
                aluno.getNome(),
                aluno.getCpf(),
                aluno.getDataNascimento(),
                aluno.getEmail(),
                aluno.getTelefone(),
                aluno.getNomeResponsavel(),
                aluno.getTelefoneResponsavel(),
                aluno.getStatus(),
                aluno.getMatriculas().stream().map(this::toMatriculaResumo).toList(),
                aluno.getNotas().stream().map(this::toNotaResumo).toList(),
                aluno.getFrequencias().stream().map(this::toFrequenciaResumo).toList(),
                aluno.getComportamentos().stream().map(this::toComportamentoResumo).toList(),
                aluno.getDesempenhos().stream().map(this::toDesempenhoResumo).toList()
        );
    }

    private MatriculaResumo toMatriculaResumo(Matricula m) {
        if (m == null) return null;
        return new MatriculaResumo(m.getId(), m.getAnoLetivo(), m.getStatus());
    }

    private NotaResumo toNotaResumo(Nota n) {
        if (n == null) return null;
        return new NotaResumo(n.getId(), n.getValor(), n.getBimestre(), n.getTipo());
    }

    private FrequenciaResumo toFrequenciaResumo(Frequencia f) {
        if (f == null) return null;
        return new FrequenciaResumo(f.getId(), f.getData(), f.getStatus());
    }

    private ComportamentoResumo toComportamentoResumo(Comportamento c) {
        if (c == null) return null;
        return new ComportamentoResumo(c.getId(), c.getData(), c.getTipo());
    }

    private DesempenhoResumo toDesempenhoResumo(Desempenho d) {
        if (d == null) return null;
        return new DesempenhoResumo(d.getId(), d.getBimestre(), d.getMedia(), d.getSituacao());
    }
    
}

package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.aluno.AlunoRequest;
import com.monitoramentoEscolar.sistema.models.Aluno;
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
}

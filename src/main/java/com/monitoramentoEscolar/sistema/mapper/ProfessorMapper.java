package com.monitoramentoEscolar.sistema.mapper;

import com.monitoramentoEscolar.sistema.dtos.professor.ProfessorRequest;
import com.monitoramentoEscolar.sistema.models.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {

    public Professor toEntity(ProfessorRequest request) {
        Professor professor = new Professor();
        professor.setNome(request.nome());
        professor.setCpf(request.cpf());
        professor.setEmail(request.email());
        professor.setFormacao(request.formacao());
        professor.setTelefone(request.telefone());
        professor.setStatus(request.status());
        return professor;
    }

    public void updateEntity(ProfessorRequest request, Professor professor) {
        professor.setNome(request.nome());
        professor.setCpf(request.cpf());
        professor.setEmail(request.email());
        professor.setFormacao(request.formacao());
        professor.setTelefone(request.telefone());
        professor.setStatus(request.status());
    }
}

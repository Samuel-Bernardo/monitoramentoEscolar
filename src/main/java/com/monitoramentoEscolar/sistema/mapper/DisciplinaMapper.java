package com.monitoramentoEscolar.sistema.mapper;


import com.monitoramentoEscolar.sistema.dtos.disciplina.DisciplinaRequest;
import com.monitoramentoEscolar.sistema.models.Disciplina;

public class DisciplinaMapper {

    public Disciplina toEntity(DisciplinaRequest request) {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(request.nome());
        disciplina.setCodigo(request.codigo());
        disciplina.setDescricao(request.descricao());
        return disciplina;
    }
}

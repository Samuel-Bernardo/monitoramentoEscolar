package com.monitoramentoEscolar.sistema.dtos.professor;

public record ProfessorResponse(
        Long id,
        String nome,
        String cpf,
        String email,
        String telefone,
        String formacao,
        String status,
        List<AtribuicaoAulaResumo> atribuicoes
) {
}

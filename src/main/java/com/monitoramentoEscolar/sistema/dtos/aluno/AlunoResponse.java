package com.monitoramentoEscolar.sistema.dtos.aluno;

import com.monitoramentoEscolar.sistema.dtos.matricula.MatriculaResumo;
import com.monitoramentoEscolar.sistema.dtos.nota.NotaResumo;

import java.time.LocalDate;
import java.util.List;

public record AlunoResponse(
        Long id,
        String nome,
        String cpf,
        LocalDate dataNascimento,
        String email,
        String telefone,
        String nomeResponsavel,
        String telefoneResponsavel,
        String status,
        List<MatriculaResumo> matriculas,
        List<NotaResumo> notas) {
}

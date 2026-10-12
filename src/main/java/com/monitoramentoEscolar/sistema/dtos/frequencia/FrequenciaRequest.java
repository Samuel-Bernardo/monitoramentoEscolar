package com.monitoramentoEscolar.sistema.dtos.frequencia;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDate;

public record FrequenciaRequest(

        @NotBlank(message = "Data é obrigatória")
        LocalDate data,

        @NotBlank(message = "Status é obrigatório")
        @Pattern(regexp = "PRESENTE|AUSENTE|JUSTIFICADO", message = "Status inválido")
        String status,

        String observacao,

        @NotNull(message = "Aluno é obrigatório")
        Long alunoId,

        @NotNull(message = "Turma é obrigatória")
        Long turmaId
) {
}

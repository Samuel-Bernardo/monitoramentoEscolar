package com.monitoramentoEscolar.sistema.dtos.turma;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record TurmaRequest(
        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotBlank(message = "Série é obrigatória")
        String serie,

        @NotBlank(message = "Ano letivo é obrigatório")
        @Pattern(regexp = "\\d{4}", message = "Ano letivo deve ter 4 dígitos")
        String anoLetivo,

        @NotBlank(message = "Turno é obrigatório")
        @Pattern(regexp = "MANHA|TARDE|NOITE", message = "Turno inválido")
        String turno,

        String sala
) {
}

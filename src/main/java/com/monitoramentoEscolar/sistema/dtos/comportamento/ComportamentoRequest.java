package com.monitoramentoEscolar.sistema.dtos.comportamento;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record ComportamentoRequest(

        @NotNull(message = "Data é obrigatória")
        @PastOrPresent(message = "Data não pode ser futura")
        LocalDate data,

        @NotBlank(message = "Tipo é obrigatório")
        @Pattern(regexp = "POSITIVO|NEGATIVO|ADVERTENCIA|ELOGIO", message = "Tipo inválido")
        String tipo,

        @NotBlank(message = "Descrição é obrigatória")
        @Size(max = 500)
        String descricao,

        @NotBlank(message = "Registrado por é obrigatório")
        String registradoPor,

        @NotNull(message = "Aluno é obrigatório")
        Long alunoId,

        @NotNull(message = "Turma é obrigatória")
        Long turmaId
) {
}

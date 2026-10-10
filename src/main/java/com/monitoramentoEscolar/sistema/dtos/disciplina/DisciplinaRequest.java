package com.monitoramentoEscolar.sistema.dtos.disciplina;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record DisciplinaRequest(

        @NotBlank(message = "Nome é obrigatório")
        String nome,

        @NotBlank(message = "Código é obrigatório")
        @Size(max = 20)
        String codigo,

        @Size(max = 500)
        String descricao
) {
}

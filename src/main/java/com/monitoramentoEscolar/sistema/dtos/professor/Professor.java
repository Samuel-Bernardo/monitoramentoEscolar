package com.monitoramentoEscolar.sistema.dtos.professor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record Professor(
        @NotBlank(message = "Nome é obrigatório")
        @Size(min = 3, max = 100)
        String nome,

        @NotBlank(message = "CPF é obrigatório")
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}", message = "CPF inválido")
        String cpf,

        @Email(message = "Email inválido")
        String email,

        String telefone,

        @NotBlank(message = "Formação é obrigatória")
        String formacao,

        @NotBlank(message = "Status é obrigatório")
        @Pattern(regexp = "ATIVO|INATIVO|AFASTADO", message = "Status inválido")
        String status
) {
}

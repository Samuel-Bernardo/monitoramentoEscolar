package com.monitoramentoEscolar.sistema.dtos.aluno;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record AlunoRequest(
        @NotBlank(message = "Nome é obrigatório")
        @Size(min = 3, max = 100)
        String nome,

        @NotBlank(message = "CPF é obrigatório")
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2}", message = "CPF inválido")
        String cpf,

        @NotNull(message = "Data de nascimento é obrigatória")
        @Past(message = "Data deve ser no passado")
        LocalDate dataNascimento,

        @Email(message = "Email inválido")
        String email,

        String telefone,

        @NotBlank(message = "Nome do responsável é obrigatório")
        String nomeResponsavel,

        String telefoneResponsavel,

        @NotBlank(message = "Status é obrigatório")
        @Pattern(regexp = "ATIVO|TRANSFERIDO|EVADIDO", message = "Status inválido")
        String status
) {
}

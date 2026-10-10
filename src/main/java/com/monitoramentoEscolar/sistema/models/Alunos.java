package com.monitoramentoEscolar.sistema.models;

import java.time.LocalDate;

public class Alunos {

    private Long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String nomeResponsavel;
    private String telefoneResponsavel;
    private String status;            // Ex: "ATIVO", "TRANSFERIDO", "EVADIDO"
}

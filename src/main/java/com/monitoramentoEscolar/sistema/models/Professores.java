package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professores {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String formacao;                // Ex: "Licenciatura em Matemática"
    private String status;          // Ex: "Ativo", "Inativo", "Afastado", "Aposentado"
}

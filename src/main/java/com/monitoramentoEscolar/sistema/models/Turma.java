package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turma {

    private Long id;
    private String nome;              // Ex: "5º A", "6º B", "1º EM"
    private String serie;             // Ex: "5º Ano", "6º Ano", "1º Ano do Ensino Médio"
    private String anoLetivo;         // Ex: "2026"
    private String turno;             // MANHA, TARDE, NOITE
    private String sala;              // Ex: "Sala 12
}

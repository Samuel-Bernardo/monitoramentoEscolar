package com.monitoramentoEscolar.sistema.models;

public class Frequencia {

    private Long id;
    private Long alunoId;
    private Long turmaId;
    private String data;              // Ex: "10/03/2026"
    private String status;            // PRESENTE, FALTA, JUSTIFICADA, ATRASADO
    private String observacao;        // Ex: "Atestado médico"
}

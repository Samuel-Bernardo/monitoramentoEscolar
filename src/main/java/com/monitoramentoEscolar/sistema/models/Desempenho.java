package com.monitoramentoEscolar.sistema.models;

public class Desempenho {

    private Long id;
    private Long alunoId;
    private Long turmaId;
    private Long disciplinaId;        // Pode ser null se for desempenho geral
    private String bimestre;          // 1º, 2º, 3º, 4º ou ANUAL
    private String anoLetivo;         // Ex: "2026"
    private Double media;             // Média calculada ou lançada
    private String situacao;          // APROVADO, REPROVADO, RECUPERACAO, EM_ANDAMENTO
    private String observacao;        // Comentário do professor
}

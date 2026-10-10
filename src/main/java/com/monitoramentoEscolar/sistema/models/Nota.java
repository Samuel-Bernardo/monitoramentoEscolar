package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Nota {

    private Long id;
    private Long alunoId;
    private Long disciplinaId;
    private Long turmaId;
    private Double valor;
    private String tipo;        // PROVA, TRABALHO, RECUPERACAO
    private String bimestre;    // 1º, 2º, 3º, 4º
}

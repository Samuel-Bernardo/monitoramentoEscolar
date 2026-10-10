package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Matricula {

    private Long id;
    private Long alunoId;
    private Long turmaId;
    private String anoLetivo;
    private String status;      // ATIVA, TRANSFERIDA, etc.
}

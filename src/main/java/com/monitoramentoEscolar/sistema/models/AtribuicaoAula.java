package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtribuicaoAula {

    private Long id;
    private Long professorId;
    private Long disciplinaId;
    private Long turmaId;
}

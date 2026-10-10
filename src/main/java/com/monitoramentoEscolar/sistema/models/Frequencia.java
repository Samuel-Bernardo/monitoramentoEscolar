package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Frequencia {

    private Long id;
    private Long alunoId;
    private Long turmaId;
    private String data;              // Ex: "10/03/2026"
    private String status;            // PRESENTE, FALTA, JUSTIFICADA, ATRASADO
    private String observacao;        // Ex: "Atestado médico"
}

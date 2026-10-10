package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comportamento {
    private Long id;
    private Long alunoId;
    private Long turmaId;
    private String data;              // Data do registro
    private String tipo;              // POSITIVO, NEGATIVO, ADVERTENCIA, ELOGIO
    private String descricao;         // Ex: "Ajudou os colegas", "Conversou muito em aula"
    private String registradoPor;     // Nome do professor ou funcionário
}

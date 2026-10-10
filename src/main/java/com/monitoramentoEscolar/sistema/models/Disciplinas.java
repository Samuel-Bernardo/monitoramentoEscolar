package com.monitoramentoEscolar.sistema.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Disciplinas {

    private Long id;
    private String nome;
    private String descricao;
}

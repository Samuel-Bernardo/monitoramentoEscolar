package com.monitoramentoEscolar.sistema.dtos.desempenho;

public record DesempenhoResumo(

        Long id,
        String bimestre,
        Double media,
        String situacao
) {
}

package com.monitoramentoEscolar.sistema.dtos.nota;

public record NotaResumo(
        Long id,
        Double valor,
        String bimestre,
        String tipo
) {
}

package com.monitoramentoEscolar.sistema.dtos.comportamento;

import java.time.LocalDate;

public record ComportamentoResumo(

        Long id,
        LocalDate data,
        String tipo
) {
}

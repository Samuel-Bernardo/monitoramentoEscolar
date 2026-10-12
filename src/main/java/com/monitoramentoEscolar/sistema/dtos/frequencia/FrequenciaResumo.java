package com.monitoramentoEscolar.sistema.dtos.frequencia;

import java.time.LocalDate;

public record FrequenciaResumo(

        Long id,
        LocalDate data,
        String status
) {
}

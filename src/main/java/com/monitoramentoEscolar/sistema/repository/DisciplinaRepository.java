package com.monitoramentoEscolar.sistema.repository;

import com.monitoramentoEscolar.sistema.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}

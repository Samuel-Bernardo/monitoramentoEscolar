package com.monitoramentoEscolar.sistema.repository;

import com.monitoramentoEscolar.sistema.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

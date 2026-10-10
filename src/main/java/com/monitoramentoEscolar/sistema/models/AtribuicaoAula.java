package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "atribuicao_aula")
public class AtribuicaoAula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O campo professorId não pode ser nulo")
    @ManyToOne(optional = false)
    @JoinColumn(name = "professorId", insertable = false, updatable = false)
    private Professor professorId;

    @NotNull(message = "O campo disciplinaId não pode ser nulo")
    @ManyToOne(optional = false)
    @JoinColumn(name = "disciplinaId", insertable = false, updatable = false)
    private Disciplina disciplinaId;

    @NotNull(message = "O campo turmaId não pode ser nulo")
    @ManyToOne(optional = false)
    @JoinColumn(name = "turmaId", insertable = false, updatable = false)
    private Turma turmaId;
}

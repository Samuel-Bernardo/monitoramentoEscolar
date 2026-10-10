package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "alunos")
@EqualsAndHashCode(exclude = {"matriculas", "notas", "frequencias", "comportamentos", "desempenhos"})
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do aluno é obrigatório")
    @Size(max = 100, message = "O nome do aluno não pode ter mais de 100 caracteres")
    @Column(length = 100 , nullable = false)
    private String nome;

    @NotBlank(message = "O CPF do aluno é obrigatório")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "O CPF deve estar no formato XXX.XXX.XXX-XX")
    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @NotNull(message = "A data de nascimento do aluno é obrigatória")
    @Past(message = "A data de nascimento deve ser uma data passada")
    @Column(nullable = false, name = "data_nascimento")
    private LocalDate dataNascimento;

    @Email(message = "O email deve ser válido")
    @Column(length = 150, unique = true)
    private String email;

    @Column(length = 20)
    private String telefone;

    @NotBlank(message = "O nome do responsável é obrigatório")
    @Size(max = 100, message = "O nome do responsável não pode ter mais de 100 caracteres")
    @Column(length = 100, nullable = false, name = "nome_responsavel")
    private String nomeResponsavel;

    @NotBlank(message = "O telefone do responsável é obrigatório")
    @Size(max = 20, message = "O telefone do responsável não pode ter mais de 20 caracteres")
    @Column(length = 20, nullable = false, name = "telefone_responsavel")
    private String telefoneResponsavel;

    @NotBlank(message = "O status do aluno é obrigatório")
    @Pattern(regexp = "ATIVO|TRANSFERIDO|EVADIDO", message = "O status deve ser 'ATIVO', 'TRANSFERIDO' ou 'EVADIDO'")
    @Column(length = 20, nullable = false)
    private String status;            // Ex: "ATIVO", "TRANSFERIDO", "EVADIDO"

    @OneToMany(mappedBy = "aluno")
    private List<Matricula> matriculas = new ArrayList<>();

    @OneToMany(mappedBy = "aluno")
    private List<Nota> notas = new ArrayList<>();

    @OneToMany(mappedBy = "aluno")
    private List<Frequencia> frequencias = new ArrayList<>();

    @OneToMany(mappedBy = "aluno")
    private List<Comportamento> comportamentos = new ArrayList<>();

    @OneToMany(mappedBy = "aluno")
    private List<Desempenho> desempenhos = new ArrayList<>();
}

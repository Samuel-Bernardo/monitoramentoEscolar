package com.monitoramentoEscolar.sistema.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "professores")
@EqualsAndHashCode(exclude = {"atribuicoes"})
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do professor é obrigatório")
    @Column(length = 100, nullable = false)
    private String nome;

    @NotBlank(message = "O CPF do professor é obrigatório")
    @Pattern(regexp = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}", message = "O CPF deve estar no formato XXX.XXX.XXX-XX")
    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Email(message = "O email deve ser válido")
    @Column(length = 150, unique = true)
    private String email;

    @NotBlank(message = "O telefone do professor é obrigatório")
    @Column(length = 20, nullable = false)
    private String telefone;

    @NotBlank(message = "A formação do professor é obrigatória")
    @Column(length = 100, nullable = false)
    private String formacao;                // Ex: "Licenciatura em Matemática"

    @NotBlank (message = "O status do professor é obrigatório")
    @Pattern(regexp = "ATIVO|INATIVO|AFASTADO")
    @Column(nullable = false)
    private String status;          // Ex: "Ativo", "Inativo", "Afastado", "Aposentado"

    @OneToMany(mappedBy = "professor")
    private List<AtribuicaoAula> atribuicoes = new ArrayList<>();
}

package br.com.lucas.Crud.models;

import br.com.lucas.Crud.controller.dto.FuncionarioParamDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "funcionario")
@Getter
@Setter
@NoArgsConstructor
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private int idade;

    @Column(name = "sexo")
    private char sexo;

    @JoinColumn(name = "id_departamento", foreignKey = @ForeignKey(name = "funcionario_departamento"))
    @OneToOne
    private Departamento departamento;

    @Column(name = "email")
    private String email;

    public Funcionario(FuncionarioParamDTO funcionarioParamDTO) {
        this.nome = funcionarioParamDTO.getNome();
        this.idade = funcionarioParamDTO.getIdade();
        this.sexo = funcionarioParamDTO.getSexo();
        this.departamento = funcionarioParamDTO.getDepartamento();
        this.email = funcionarioParamDTO.getEmail();
    }
}

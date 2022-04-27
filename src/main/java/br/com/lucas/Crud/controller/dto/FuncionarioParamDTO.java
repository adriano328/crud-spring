package br.com.lucas.Crud.controller.dto;

import br.com.lucas.Crud.models.Departamento;
import lombok.Getter;

@Getter
public class FuncionarioParamDTO {

    private String nome;

    private int idade;

    private char sexo;

    private Departamento departamento;

    private String email;
}

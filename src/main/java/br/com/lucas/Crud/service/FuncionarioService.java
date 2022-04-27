package br.com.lucas.Crud.service;

import br.com.lucas.Crud.controller.dto.FuncionarioParamDTO;
import br.com.lucas.Crud.models.Funcionario;
import br.com.lucas.Crud.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Long cadastrar(FuncionarioParamDTO funcionarioParamDTO){

        var funcionario = new Funcionario(funcionarioParamDTO);
        return funcionarioRepository.save(funcionario).getId();
    }
}

package br.com.lucas.Crud.controller;

import br.com.lucas.Crud.controller.dto.FuncionarioParamDTO;
import br.com.lucas.Crud.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    public ResponseEntity<Long> cadastrarFuncionario(@RequestBody FuncionarioParamDTO funcionarioParamDTO){

        return ResponseEntity.ok(funcionarioService.cadastrar(funcionarioParamDTO));
    }

}

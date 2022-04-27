package br.com.lucas.Crud.controller;

import br.com.lucas.Crud.controller.dto.DepartamentoParamDTO;
import br.com.lucas.Crud.models.Departamento;
import br.com.lucas.Crud.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departamento")
public class DepartamentoController {

    @Autowired
    private DepartamentoService departamentoService;

    @PostMapping
    public ResponseEntity<Long> cadastrarDepartamento(@RequestBody DepartamentoParamDTO departamentoParamDTO){


        return ResponseEntity.ok(departamentoService.cadastrar(departamentoParamDTO));
    }

}

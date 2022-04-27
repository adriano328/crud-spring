package br.com.lucas.Crud.service;

import br.com.lucas.Crud.controller.dto.DepartamentoParamDTO;
import br.com.lucas.Crud.models.Departamento;
import br.com.lucas.Crud.repositories.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    public Long cadastrar(DepartamentoParamDTO departamentoParamDTO){

        var departamento = new Departamento(departamentoParamDTO);
        return departamentoRepository.save(departamento).getId();
    };



}

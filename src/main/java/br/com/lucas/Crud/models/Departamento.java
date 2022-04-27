package br.com.lucas.Crud.models;

import br.com.lucas.Crud.controller.dto.DepartamentoParamDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "departamento")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_departamento")
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    public Departamento(DepartamentoParamDTO departamentoParamDTO) {
        this.descricao = departamentoParamDTO.getDescricao();
    }


}

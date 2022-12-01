package br.edu.ifpr.paranavai.armarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Armario {
    
    private Integer id;
    
    private String numero;
    
    private boolean ativo;
    
    private String observacoes;
}

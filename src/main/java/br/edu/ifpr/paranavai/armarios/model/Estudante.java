package br.edu.ifpr.paranavai.armarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Estudante extends Pessoa{
    
    private String ra;
    private boolean emprestado;
    private int chave;
}

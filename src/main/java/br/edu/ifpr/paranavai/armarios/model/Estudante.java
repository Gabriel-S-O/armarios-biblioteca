package br.edu.ifpr.paranavai.armarios.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Estudante extends Pessoa {

    private Integer id;

    private String ra;
}

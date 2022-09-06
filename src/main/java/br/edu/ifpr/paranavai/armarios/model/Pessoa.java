package br.edu.ifpr.paranavai.armarios.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;
    private boolean ativo;
    private Date dataAtualizacao;
    private Date dataCriacao;
}

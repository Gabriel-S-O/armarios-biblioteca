package br.edu.ifpr.paranavai.armarios.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bibliotecario extends Pessoa{
    private String siape;

    public Bibliotecario(String siape, String cpf, String nome, String email, String telefone, String senha, int chave, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, cpf, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }
    
}
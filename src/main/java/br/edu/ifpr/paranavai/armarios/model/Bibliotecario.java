package br.edu.ifpr.paranavai.armarios.model;

import java.util.Date;

public class Bibliotecario extends Pessoa{
    private String siape;

    public Bibliotecario() {
    }

    public Bibliotecario(String siape, String cpf, String nome, String email, String telefone, String senha, int chave, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, cpf, email, telefone, senha, chave, ativo, dataAtualizacao, dataCriacao);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
package br.edu.ifpr.paranavai.armarios.model;

import java.util.Date;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private String senha;
    private boolean ativo;
    private Date dataAtualizacao;
    private Date dataCriacao;
    private int chave;
    
    public Pessoa() {
        
    }

    public Pessoa(String nome, String cpf, String email, String telefone, String senha, int chave, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.chave = chave;
        this.ativo = ativo;
        this.dataAtualizacao = dataAtualizacao;
        this.dataCriacao = dataCriacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
}

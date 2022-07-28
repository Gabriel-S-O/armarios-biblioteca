package br.edu.ifpr.paranavai.armarios.model;

import java.util.Date;

public class Estudante extends Pessoa{
    private String ra;
    private boolean emprestado;
    
    public Estudante(){
        super("Teste", "000.000.000-00", "teste@gmail.com", "44991119471", "senha", true, null, null);
        this.ra = "1234567890";
    }

    public Estudante(String ra, boolean emprestado, String nome, String cpf, String email, String telefone, String senha, boolean ativo, Date dataAtualizacao, Date dataCriacao) {
        super(nome, cpf, email, telefone, senha, ativo, dataAtualizacao, dataCriacao);
        this.ra = ra;
        this.emprestado = emprestado;
    }

    
    

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
}

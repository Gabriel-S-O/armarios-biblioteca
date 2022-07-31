package br.edu.ifpr.paranavai.armarios.model;

public class Estudante extends Pessoa{
    
    private String ra;
    private boolean emprestado;
    private int chave;
    
    public Estudante(){}

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

    public int getChave() {
        return chave;
    }

    public void setChave(int chave) {
        this.chave = chave;
    }
}

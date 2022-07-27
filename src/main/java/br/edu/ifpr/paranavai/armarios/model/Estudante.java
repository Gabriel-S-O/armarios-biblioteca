package br.edu.ifpr.paranavai.armarios.model;

public class Estudante extends Pessoa{
    private String ra;
    private boolean emprestado;
    
    public Estudante(){
        super("Teste", "12306612300", "teste@gmail.com", "44991119471", "senha", true, null, null);
        this.ra = "1234567890";
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

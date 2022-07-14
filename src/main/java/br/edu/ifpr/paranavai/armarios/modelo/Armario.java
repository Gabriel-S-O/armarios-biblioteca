package br.edu.ifpr.paranavai.armarios.modelo;
public class Armario {
    private String numero;
    private boolean ativo;
    private String observacoes;

    public Armario() {
    }

    public Armario(String numero, boolean ativo, String observacoes) {
        this.numero = numero;
        this.ativo = ativo;
        this.observacoes = observacoes;
    }
}

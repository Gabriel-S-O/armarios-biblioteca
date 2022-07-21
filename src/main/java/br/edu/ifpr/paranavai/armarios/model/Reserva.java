package br.edu.ifpr.paranavai.armarios.model;
import java.util.Date;

public class Reserva {
    private Estudante estudante;
    private Armario armario;
    private Date dataHoraDevolucao;
    private Date dataHoraEmprestimo;

    public Reserva() {
    }

    public Reserva(Estudante estudante, Armario armario, Date dataHoraDevolucao, Date dataHoraEmprestimo) {
        this.estudante = estudante;
        this.armario = armario;
        this.dataHoraDevolucao = dataHoraDevolucao;
        this.dataHoraEmprestimo = dataHoraEmprestimo;
    }
}

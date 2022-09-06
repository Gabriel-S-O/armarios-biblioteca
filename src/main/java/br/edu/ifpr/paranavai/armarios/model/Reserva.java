package br.edu.ifpr.paranavai.armarios.model;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Reserva {
    
    private Estudante estudante;
    private Armario armario;
    private Date dataHoraDevolucao;
    private Date dataHoraEmprestimo;
}

package br.edu.ifpr.paranavai.armarios.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Estudante estudante_id;

    @ManyToOne
    private Armario armario_id;

    private Date dataHoraDevolucao;

    private Date dataHoraEmprestimo;
}

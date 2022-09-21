/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.entity.Estudante;
import br.edu.ifpr.paranavai.armarios.entity.Reserva;
import br.edu.ifpr.paranavai.armarios.service.ReservaService;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

/**
 *
 * @author Yago Macinelli
 */
public class ReservaController {
    
    ReservaService service = new ReservaService();
    
    public InfoDTO realizaEmprestimo(Estudante estudante, String numeroArmario) {
        return service.realizaEmprestimo(estudante, numeroArmario);
    }
    
    public InfoDTO realizaDevolucao(Reserva reserva) {
        return service.realizaDevolucao(reserva);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.model.Estudante;
import br.edu.ifpr.paranavai.armarios.service.ReservaService;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

/**
 *
 * @author Nextage
 */
public class ReservaController {
    
    public String realizaEmprestimo(Estudante estudante, String numeroArmario) {
        ReservaService service = new ReservaService();
        return service.realizaEmprestimo(estudante, numeroArmario);
    }
}

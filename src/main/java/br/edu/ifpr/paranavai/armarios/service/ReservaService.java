/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.model.Armario;
import br.edu.ifpr.paranavai.armarios.model.Estudante;
import br.edu.ifpr.paranavai.armarios.model.Reserva;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;
import java.util.Date;

/**
 *  
 * @author Yago Macinelli
 */
public class ReservaService {
    
    public String realizaEmprestimo(Estudante estudante, String numArm){
        InfoDTO info = new InfoDTO();
        
        Armario armario = new Armario();
        armario.setNumero(numArm);
        
        Date date = new Date();
        
        if (estudante.getEmprestado()!= true) {
            Reserva reserva = new Reserva();
            
            reserva.setArmario(armario);
            reserva.setDataHoraEmprestimo(date);
            reserva.setEstudante(estudante);
            
            return "Armário reservado com sucesso!";
        } else {
            return "Já possui um armário reservado!";
        }
    }
}

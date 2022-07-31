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
    
    public InfoDTO realizaEmprestimo(Estudante estudante, String numArm){
        InfoDTO info = new InfoDTO();
        
        Armario armario = new Armario();
        armario.setNumero(numArm);
        
        Date date = new Date();
        
        if (estudante.getEmprestado()!= true) {
            Reserva reserva = new Reserva();
            
            estudante.setEmprestado(true);
            reserva.setArmario(armario);
            reserva.setDataHoraEmprestimo(date);
            reserva.setEstudante(estudante);
            
            info.setError(false);
            info.setMessage("Armário " + armario.getNumero() + " reservado com sucesso!");
            return info;
        } else {
            info.setError(true);
            info.setMessage("Já possui um armário reservado!");
            return info;
        }
    }
    
    public InfoDTO realizaDevolucao(boolean emprestado, Estudante estudante) {
        InfoDTO info = new InfoDTO();
        Reserva reserva = new Reserva();
        
        Date date = new Date();
        reserva.setDataHoraDevolucao(date);
        estudante.setEmprestado(emprestado);
        reserva.setEstudante(estudante);
        
        info.setError(false);
        info.setMessage("Chave devolvida com sucesso!" );
        
        return info;
    }
}

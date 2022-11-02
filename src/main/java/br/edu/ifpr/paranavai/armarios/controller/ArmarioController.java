/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.controller;

import br.edu.ifpr.paranavai.armarios.entity.Armario;
import br.edu.ifpr.paranavai.armarios.service.ArmarioService;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ArmarioController {
    
    ArmarioService service = new ArmarioService();
    
    public List<Armario> listarTodosArmarios(){
        return service.listarTodosArmarios();
    }
    
    public Armario listarArmario(int numeroArmario){
        return service.listarArmario(numeroArmario);
    }
    
    public void apagarArmario(int numeroArmario){
        service.apagarArmario(numeroArmario);
    }
}

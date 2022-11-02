/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.dao.ArmarioDao;
import br.edu.ifpr.paranavai.armarios.entity.Armario;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ArmarioService {

    public List<Armario> listarTodosArmarios() {
        return new ArmarioDao().findAll();
    }

    public Armario listarArmario(int numeroArmario) {
        return new ArmarioDao().findByNumero(numeroArmario);
    }

    public void apagarArmario(int numeroArmario) {
        new ArmarioDao().deleteByNumero(numeroArmario);
        }
     
}

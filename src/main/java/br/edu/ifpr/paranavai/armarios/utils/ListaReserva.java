/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.utils;

import br.edu.ifpr.paranavai.armarios.model.Armario;
import br.edu.ifpr.paranavai.armarios.model.Estudante;
import br.edu.ifpr.paranavai.armarios.model.Reserva;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nextage
 */
public class ListaReserva {

    private List<Reserva> listaReservas = new ArrayList<>();

    public ListaReserva() {
       
        Reserva reserva0 = new Reserva();
        Estudante listaEstudante0 = new ListaEstudante().getListaEstudantes().get(1);
        Armario armario0 = new Armario();
        
        
        armario0.setAtivo(true);
        armario0.setNumero("10");
        reserva0.setEstudante(listaEstudante0);
        reserva0.setArmario(armario0);
        
        Reserva reserva1 = new Reserva();
        Estudante listaEstudante1 = new ListaEstudante().getListaEstudantes().get(2);
        Armario armario1 = new Armario();
        
        
        armario1.setAtivo(true);
        armario1.setNumero("20");
        reserva1.setEstudante(listaEstudante1);
        reserva1.setArmario(armario1);
        
        this.listaReservas.add(reserva0);
        this.listaReservas.add(reserva1);
        
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

}

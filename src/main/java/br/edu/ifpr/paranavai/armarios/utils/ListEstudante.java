/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.utils;

import br.edu.ifpr.paranavai.armarios.model.Estudante;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yago Macinelli
 */

public class ListEstudante {
    private List<Estudante> listaEstudantes = new ArrayList<>();
    
    public ListEstudante() {
        
        Estudante estudante0 = new Estudante();
        
        estudante0.setCpf("01203961923");
        estudante0.setEmail("blabla@gmail.com");
        estudante0.setNome("José Utrila");
        estudante0.setRa("0987654321");
        estudante0.setSenha("123456");
        
        Estudante estudante1 = new Estudante();
        
        estudante1.setCpf("14725836900");
        estudante1.setEmail("yago@gmail.com");
        estudante1.setNome("Yago Macinelli");
        estudante1.setRa("20210023");
        estudante1.setSenha("senha");
        
        Estudante estudante2 = new Estudante();
        
        estudante2.setCpf("00000011122");
        estudante2.setEmail("terenciani@hotmail.com");
        estudante2.setNome("Marcelo Terenciani");
        estudante2.setRa("20220300");
        estudante2.setSenha("terenciani");
        
        Estudante estudante3 = new Estudante();
        
        estudante3.setCpf("47586912300");
        estudante3.setEmail("gabriel@icloud.com");
        estudante3.setNome("Gabriel Silva");
        estudante3.setRa("20190023");
        estudante3.setSenha("senha123");
        
        Estudante estudante4 = new Estudante();
        
        estudante4.setCpf("15926348700");
        estudante4.setEmail("matheus@gmail.com");
        estudante4.setNome("Matheus José");
        estudante4.setRa("20212322");
        estudante4.setSenha("cnm10age");
        
        listaEstudantes.add(estudante0);
        listaEstudantes.add(estudante1);
        listaEstudantes.add(estudante2);
        listaEstudantes.add(estudante3);
        listaEstudantes.add(estudante4);
    }

    public List<Estudante> getListaEstudantes() {
        return listaEstudantes;
    }

    public void setListaEstudantes(List<Estudante> listaEstudantes) {
        this.listaEstudantes = listaEstudantes;
    }
}

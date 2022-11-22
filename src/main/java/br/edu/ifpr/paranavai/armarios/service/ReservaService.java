/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.paranavai.armarios.service;

import br.edu.ifpr.paranavai.armarios.dao.ArmarioDao;
import br.edu.ifpr.paranavai.armarios.dao.ReservaDao;
import br.edu.ifpr.paranavai.armarios.entity.Armario;
import br.edu.ifpr.paranavai.armarios.entity.Estudante;
import br.edu.ifpr.paranavai.armarios.entity.Reserva;
import br.edu.ifpr.paranavai.armarios.utils.InfoDTO;

import java.util.Date;

public class ReservaService {

    InfoDTO info = new InfoDTO();
    
    public InfoDTO realizaEmprestimo(Estudante estudante, String numeroArmario) {
        
        Armario armario = new ArmarioDao().findByNumero(Integer.valueOf(numeroArmario));
        
        Reserva reserva = new ReservaDao().findByArmario(armario);

        if (reserva.getDataHoraDevolucao() == null) {
            info.setError(true);
            info.setMessage("Armário " + numeroArmario + " já está reservado. Tente outro");
            return info;
        } else {
            Reserva reservaToSave = new Reserva();
            ReservaDao reservaDao = new ReservaDao();

            reservaToSave.setEstudante(estudante);
            reservaToSave.setDataHoraEmprestimo(new Date());
            reservaToSave.setArmario(armario);

            reservaDao.save(reservaToSave);

            info.setError(false);
            info.setMessage("Armário " + numeroArmario + " reservado com sucesso!");
            return info;
        }
    }

    public InfoDTO realizaDevolucao(Reserva reserva) {
        
        ReservaDao reservaDao = new ReservaDao();

        try {
            reserva.setDataHoraDevolucao(new Date());
            reservaDao.update(reserva);

            info.setError(false);
            info.setMessage("Chave devolvida com sucesso!");
            return info;
        } catch (Exception e) {
            e.printStackTrace();

            info.setError(true);
            info.setMessage("Problemas ao devolver chave.");
            return info;
        }
    }
    
}

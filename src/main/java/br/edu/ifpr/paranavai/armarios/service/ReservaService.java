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
import java.util.List;

/**
 *
 * @author Yago Macinelli
 */
public class ReservaService {

    public InfoDTO realizaEmprestimo(Estudante estudante, String numArm) {
        InfoDTO info = new InfoDTO();
        Armario armario = new ArmarioDao().findByNumero(Integer.valueOf(numArm));
        br.edu.ifpr.paranavai.armarios.entity.Reserva reserva = new ReservaDao().findByArmario(armario);

        if (reserva.getDataHoraDevolucao() == null) {
            info.setError(true);
            info.setMessage("Armário " + numArm + " já está reservado. Tente outro");
            return info;
        } else {
            Reserva reservaToSave = new Reserva();
            ReservaDao reservaDao = new ReservaDao();

            reservaToSave.setEstudante(estudante);
            reservaToSave.setDataHoraEmprestimo(new Date());
            reservaToSave.setArmario(armario);

            reservaDao.save(reservaToSave);

            info.setError(false);
            info.setMessage("Armário " + numArm + " reservado com sucesso!");
            return info;
        }
    }

    public InfoDTO realizaDevolucao(Reserva reserva) {
        InfoDTO info = new InfoDTO();
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

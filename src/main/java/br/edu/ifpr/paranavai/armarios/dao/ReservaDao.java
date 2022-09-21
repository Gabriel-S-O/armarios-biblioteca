package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Armario;
import br.edu.ifpr.paranavai.armarios.entity.Estudante;
import br.edu.ifpr.paranavai.armarios.entity.Reserva;

import java.util.List;

public class ReservaDao extends GenericDao<Reserva, Long> {

    public ReservaDao() {
        super(Reserva.class);
    }

    public Reserva findByEstudante(Estudante estudante) {
        return entityManager.createQuery("SELECT r FROM Reserva r WHERE r.estudante.id = :estudante ORDER BY r.dataHoraEmprestimo DESC", Reserva.class).setParameter("estudante", estudante.getId()).getResultList().get(0);
    }

    public Reserva findByArmario(Armario armario) {
        return entityManager.createQuery("SELECT r FROM Reserva r WHERE r.armario.id = :armario ORDER BY r.dataHoraEmprestimo DESC", Reserva.class).setParameter("armario", armario.getId()).getResultList().get(0);
    }
}

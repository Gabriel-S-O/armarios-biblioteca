package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Armario;
import br.edu.ifpr.paranavai.armarios.entity.Estudante;
import br.edu.ifpr.paranavai.armarios.entity.Reserva;

public class ReservaDao extends GenericDao<Reserva, Long> {

    public ReservaDao() {
        super(Reserva.class);
    }

    public Reserva findByEstudante(Estudante estudante) {
        return entityManager.createQuery("SELECT r FROM Reserva r WHERE r.estudante.id = :estudante", Reserva.class).setParameter("estudante", estudante.getId()).getSingleResult();
    }

    public Reserva findByArmario(Armario armario) {
        return entityManager.createQuery("SELECT r FROM Reserva r WHERE r.armario.id = :armario", Reserva.class).setParameter("armario", armario.getId()).getSingleResult();
    }
}

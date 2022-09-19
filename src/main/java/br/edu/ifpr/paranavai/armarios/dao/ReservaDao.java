package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Reserva;

public class ReservaDao extends GenericDao<Reserva, Long> {

    public ReservaDao() {
        super(Reserva.class);
    }
}

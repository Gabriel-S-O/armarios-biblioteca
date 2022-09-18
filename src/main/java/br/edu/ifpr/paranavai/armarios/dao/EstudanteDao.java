package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Estudante;

public class EstudanteDao extends GenericDao<Estudante, Long> {

    public EstudanteDao() {
        super(Estudante.class);
    }
}

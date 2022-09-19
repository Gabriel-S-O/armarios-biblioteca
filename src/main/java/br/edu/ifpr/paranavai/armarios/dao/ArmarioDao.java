package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Armario;

public class ArmarioDao extends GenericDao<Armario, Long> {

    public ArmarioDao() {
        super(Armario.class);
    }
}

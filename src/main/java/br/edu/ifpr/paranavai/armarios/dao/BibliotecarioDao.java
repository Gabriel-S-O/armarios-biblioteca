package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Bibliotecario;

public class BibliotecarioDao extends GenericDao<Bibliotecario, Long> {

    public BibliotecarioDao() {
        super(Bibliotecario.class);
    }
}

package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Bibliotecario;

public class BibliotecarioDao extends GenericDao<Bibliotecario, Long> {

    public BibliotecarioDao() {
        super(Bibliotecario.class);
    }

    public Bibliotecario findBySiape(String siape) {
        return entityManager.createQuery("SELECT b FROM bibliotecario b WHERE b.siape = :siape", Bibliotecario.class).setParameter("siape", siape).getResultStream().findFirst().orElse(null);
    }
}

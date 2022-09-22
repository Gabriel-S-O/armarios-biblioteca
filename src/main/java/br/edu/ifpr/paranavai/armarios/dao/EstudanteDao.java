package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Estudante;

public class EstudanteDao extends GenericDao<Estudante, Long> {

    public EstudanteDao() {
        super(Estudante.class);
    }

    public Estudante findByRa(String ra) {
        return entityManager.createQuery("SELECT e FROM Estudante e WHERE e.ra = :ra", Estudante.class).setParameter("ra", ra).getResultStream().findFirst().orElse(null);
    }

    public Estudante findByCpf(String cpf) {
        return entityManager.createQuery("SELECT e FROM Estudante e WHERE e.cpf = :cpf", Estudante.class).setParameter("cpf", cpf).getResultStream().findFirst().orElse(null);
    }
}

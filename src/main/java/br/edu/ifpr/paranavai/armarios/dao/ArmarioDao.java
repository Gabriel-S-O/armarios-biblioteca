package br.edu.ifpr.paranavai.armarios.dao;

import br.edu.ifpr.paranavai.armarios.entity.Armario;

public class ArmarioDao extends GenericDao<Armario, Long> {

    public ArmarioDao() {
        super(Armario.class);
    }

    public Armario findByNumero(Integer numero) {
        return entityManager.createQuery("SELECT a FROM Armario a WHERE a.numero = :numero", Armario.class).setParameter("numero", numero).getSingleResult();
    }
    
    public void deleteByNumero(Integer numero){
        entityManager.createQuery("DELETE a FROM Armario a WHERE a.numero = :numero", Armario.class).setParameter("numero", numero);      
    }
}

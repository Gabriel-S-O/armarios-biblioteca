package br.edu.ifpr.paranavai.armarios.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

@Data
public class GenericDao <T, I extends Serializable> {

    private Class<T> persistedClass;
    protected EntityManager entityManager;

    protected GenericDao() {
        entityManager = getEntityManager();
    }

    protected GenericDao(Class<T> persistedClass) {
        this();
        this.persistedClass = persistedClass;
    }

    private EntityManager getEntityManager() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("armarios-biblioteca");
        if (entityManager == null) {
            entityManager = entityManagerFactory.createEntityManager();
        }
        return entityManager;
    }

    public T findById(int id) {
        return entityManager.find(persistedClass, id);
    }

    public void save(T persistedObject) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(persistedObject);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void update(T updateObject) {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(updateObject);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public void removeById(int id) {
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(id);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            entityManager.getTransaction().rollback();
        }
    }

    public List<T> finAll() {
        return entityManager.createQuery("FROM " + persistedClass.getName()).getResultList();
    }
}

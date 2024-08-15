package services;

import entities.Artist;
import entities.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CRDOperations {

    public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Artist artist = new Artist(6,"Lil","Wayne");
        entityManager.persist(artist);
        entityManager.getTransaction().commit();
        entityManager.close();



    }

    public void findEntity(){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Artist artist = entityManager.find(Artist.class,1);
        System.out.println(artist.getId() + artist.getLastName() + artist.getLastName());
    }



}

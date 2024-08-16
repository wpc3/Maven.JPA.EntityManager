package services;

import entities.Artist;
import entities.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.List;

public class CRDOperations implements ArtistList {

    public void insertEntity() {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Artist artist = new Artist(6,"Lil","Wayne","Tambourine");
//        entityManager.persist(artist);
        entityManager.merge(artist);
        entityManager.getTransaction().commit();
//        entityManager.close();
        System.out.println(artist.getId() + " " + artist.getFirstName() + " " + artist.getLastName());


    }

    public void findEntity(){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Artist artist = entityManager.find(Artist.class,6);
        System.out.println(artist.getId() + " " + artist.getFirstName() + " " + artist.getLastName() + " " + artist.getInstrument());
    }

    public void updateEntity(){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Artist artist =entityManager.find(Artist.class,6);
        artist.setFirstName("Dwayne");
        artist.setLastName("Carter");
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println(artist.getId() + " " + artist.getFirstName() + " " + artist.getLastName() + " " + artist.getInstrument());
    }

    public void removeEntity(){
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Artist artist = entityManager.find(Artist.class,6);
        System.out.println("Deleting record: " + artist.getId() + " " + artist.getFirstName() + " " + artist.getLastName() + " " + artist.getInstrument());
        entityManager.remove(artist);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


//    @Override
    public List<Artist> findAll() {
//    List<Artist> list = new ArrayList<>();
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.find(Artist.class,list);
////        entityManager.getTransaction().commit();
////        entityManager.close();
//        System.out.println(list);
       List<Artist> list = entityManager.createQuery("SELECT a FROM Artist a", Artist.class).getResultList();
            entityManager.close();
        System.out.println(list);



        return list;
    }
}

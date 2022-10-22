package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("edu.tawfik.cs");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();

        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}

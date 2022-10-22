package  org.example.onetoone.joincolumnAndCascading;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppMain {

    public static void main(String[] args) {

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("edu.tawfik.cs");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();

        Customer p=new Customer("tawfeek","shalash");
        Address address=new Address("emam moslim","1258");

        p.setAddress(address);
        address.setCustomer(p);

        em.persist(p);

        em.getTransaction().commit();
        em.close();
        emf.close();



    }

}

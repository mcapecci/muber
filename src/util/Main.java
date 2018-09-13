package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.Pasajero;

import java.util.List;

public class Main {
  public static void main(String[] args) {
      SessionFactory sessionFactory = new Configuration().configure()
                                                         .buildSessionFactory();
      try {
          persist(sessionFactory);
          load(sessionFactory);
      } finally {
          sessionFactory.close();
      }
  }

  private static void load(SessionFactory sessionFactory) {
	  
      System.out.println("-- loading pasajeros --");
      Session session = sessionFactory.openSession();
      @SuppressWarnings("unchecked")
      List<Pasajero> pasajeros = session.createQuery("FROM Pasajero").list();
      pasajeros.forEach((x) -> System.out.printf("- %s%n", x));
      session.close();
  }

  private static void persist(SessionFactory sessionFactory) {
	  Pasajero p1 = new Pasajero();
	  p1.setUsername("pasajero1");
	  Pasajero p2 = new Pasajero();
	  p2.setUsername("pasajero2");
	  
      System.out.println("-- persisting pasajeros --");
      System.out.printf("- %s%n- %s%n", p1, p2);

      Session session = sessionFactory.openSession();
      session.beginTransaction();
      session.save(p1);
      session.save(p2);
      session.getTransaction().commit();
  }
  
}

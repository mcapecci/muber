package util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import modelo.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class Main {
  public static void main(String[] args) throws HibernateException, ParseException {
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

  private static void persist(SessionFactory sessionFactory) throws HibernateException, ParseException {
	  /*
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
	  */
	
	Muber muber = cargarBase();
	Session session = sessionFactory.openSession();
      	session.beginTransaction();
      	session.save(muber);
      	session.getTransaction().commit();
	
  }
	
private static Muber cargarBase() throws HibernateException, ParseException {
	LocalDate today = LocalDate.now(); 
	//today.plusDays(long) o minusDays(long) o minus/plusYears(long) o minus/plusMonths()

	DateFormat dfm = new SimpleDateFormat("yyyy-MM-dd");
	/* Fehcas de ingreso */
	Date d1 = dfm.parse("2008-11-10");
	Date d2 = dfm.parse("2014-08-10");
	Date d3 = dfm.parse("2015-06-18");
	Date d4 = dfm.parse("2012-04-24");
	Date d5 = dfm.parse("2016-01-20");
	Date d6 = dfm.parse("2017-08-02");
	Date d7 = dfm.parse("2012-12-14");
	Date d8 = dfm.parse("2012-08-23");
	Date d9 = dfm.parse("2017-08-23");
	Date d10 = dfm.parse("2012-06-04");
	Date d11 = dfm.parse("2013-11-22");
	Date d12 = dfm.parse("2017-04-22");
	Date d13 = dfm.parse("2011-06-10");
	Date d14 = dfm.parse("2017-07-20");
	Date d15 = dfm.parse("2014-09-20");
	Date d16 = dfm.parse("2015-06-18");
	Date d17 = dfm.parse("2010-10-13");
	Date d18 = dfm.parse("2012-05-20");
	Date d19 = dfm.parse("2013-10-08");
	Date d20 = dfm.parse("2018-03-26");


	/* Usuarios - Pasajeros*/
	Pasajero pasajero1 = new Pasajero();
	pasajero1.setUsername("pasajero1");
	pasajero1.setPassword("admin");
	pasajero1.setFechaIngreso(d1);
	Pasajero pasajero2 = new Pasajero();
	pasajero2.setUsername("pasajero2");
	pasajero2.setPassword("admin");
	pasajero2.setFechaIngreso(d2);
	Pasajero pasajero3 = new Pasajero();
	pasajero3.setUsername("pasajero3");
	pasajero3.setPassword("admin");
	pasajero3.setFechaIngreso(d3);
	Pasajero pasajero4 = new Pasajero();
	pasajero4.setUsername("pasajero4");
	pasajero4.setPassword("admin");
	pasajero4.setFechaIngreso(d4);
	Pasajero pasajero5 = new Pasajero();
	pasajero5.setUsername("pasajero5");
	pasajero5.setPassword("admin");
	pasajero5.setFechaIngreso(d5);
	Pasajero pasajero6 = new Pasajero();
	pasajero6.setUsername("pasajero6");
	pasajero6.setPassword("admin");
	pasajero6.setFechaIngreso(d6);
	Pasajero pasajero7 = new Pasajero();
	pasajero7.setUsername("pasajero7");
	pasajero7.setPassword("admin");
	pasajero7.setFechaIngreso(d7);
	Pasajero pasajero8 = new Pasajero();
	pasajero8.setUsername("pasajero8");
	pasajero8.setPassword("admin");
	pasajero8.setFechaIngreso(d8);
	Pasajero pasajero9 = new Pasajero();
	pasajero9.setUsername("pasajero9");
	pasajero9.setPassword("admin");
	pasajero9.setFechaIngreso(d9);
	Pasajero pasajero10 = new Pasajero();
	pasajero10.setUsername("pasajero10");
	pasajero10.setPassword("admin");
	pasajero10.setFechaIngreso(d10);
	Pasajero pasajero11 = new Pasajero();
	pasajero11.setUsername("pasajero11");
	pasajero11.setPassword("admin");
	pasajero11.setFechaIngreso(d11);
	Pasajero pasajero12 = new Pasajero();
	pasajero12.setUsername("pasajero12");
	pasajero12.setPassword("admin");
	pasajero12.setFechaIngreso(d12);
	Pasajero pasajero13 = new Pasajero();
	pasajero13.setUsername("pasajero13");
	pasajero13.setPassword("admin");
	pasajero13.setFechaIngreso(d13);
	Pasajero pasajero14 = new Pasajero();
	pasajero14.setUsername("pasajero14");
	pasajero14.setPassword("admin");
	pasajero14.setFechaIngreso(d14);
	Pasajero pasajero15 = new Pasajero();
	pasajero15.setUsername("pasajero15");
	pasajero15.setPassword("admin");
	pasajero15.setFechaIngreso(d15);
	Pasajero pasajero16 = new Pasajero();
	pasajero16.setUsername("pasajero16");
	pasajero16.setPassword("admin");
	pasajero16.setFechaIngreso(d16);
	Pasajero pasajero17 = new Pasajero();
	pasajero17.setUsername("pasajero17");
	pasajero17.setPassword("admin");
	pasajero17.setFechaIngreso(d17);
	Pasajero pasajero18 = new Pasajero();
	pasajero18.setUsername("pasajero18");
	pasajero18.setPassword("admin");
	pasajero18.setFechaIngreso(d18);
	Pasajero pasajero19 = new Pasajero();
	pasajero19.setUsername("pasajero19");
	pasajero19.setPassword("admin");
	pasajero19.setFechaIngreso(d19);
	Pasajero pasajero20 = new Pasajero();
	pasajero20.setUsername("pasajero20");
	pasajero20.setPassword("admin");
	pasajero20.setFechaIngreso(d20);

	/* Usuarios - Conductores */
	Conductor conductor1 = new Conductor();
	conductor1.setUsername("conductor1");
	conductor1.setPassword("admin");
	conductor1.setFechaIngreso(d1);
	conductor1.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(1)));
	Conductor conductor2 = new Conductor();
	conductor2.setUsername("conductor2");
	conductor2.setPassword("admin");
	conductor2.setFechaIngreso(d2);
	conductor2.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(2)));
	Conductor conductor3 = new Conductor();
	conductor3.setUsername("conductor3");
	conductor3.setPassword("admin");
	conductor3.setFechaIngreso(d3);
	conductor3.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(2)));
	Conductor conductor4 = new Conductor();
	conductor4.setUsername("conductor4");
	conductor4.setPassword("admin");
	conductor4.setFechaIngreso(d4);
	conductor4.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(3)));
	Conductor conductor5 = new Conductor();
	conductor5.setUsername("conductor5");
	conductor5.setPassword("admin");
	conductor5.setFechaIngreso(d5);
	conductor5.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(3)));
	Conductor conductor6 = new Conductor();
	conductor6.setUsername("conductor6");
	conductor6.setPassword("admin");
	conductor6.setFechaIngreso(d6);
	conductor6.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(4)));
	Conductor conductor7 = new Conductor();
	conductor7.setUsername("conductor7");
	conductor7.setPassword("admin");
	conductor7.setFechaIngreso(d7);
	conductor7.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(2)));
	Conductor conductor8 = new Conductor();
	conductor8.setUsername("conductor8");
	conductor8.setPassword("admin");
	conductor8.setFechaIngreso(d8);
	conductor8.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(1)));
	Conductor conductor9 = new Conductor();
	conductor9.setUsername("conductor9");
	conductor9.setPassword("admin");
	conductor9.setFechaIngreso(d9);
	conductor9.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(1)));
	Conductor conductor10 = new Conductor();
	conductor10.setUsername("conductor10");
	conductor10.setPassword("admin");
	conductor10.setFechaIngreso(d10);
	conductor10.setFechaVencimientoLicencia(java.sql.Date.valueOf(today.plusYears(1)));

	/* Muber */
	HashSet<Pasajero> pasajeros = new HashSet<Pasajero>();
	pasajeros.add(pasajero1);
	pasajeros.add(pasajero2);
	pasajeros.add(pasajero3);
	pasajeros.add(pasajero4);
	pasajeros.add(pasajero5);
	pasajeros.add(pasajero6);
	pasajeros.add(pasajero7);
	pasajeros.add(pasajero8);
	pasajeros.add(pasajero9);
	pasajeros.add(pasajero10);
	pasajeros.add(pasajero11);
	pasajeros.add(pasajero12);
	pasajeros.add(pasajero13);
	pasajeros.add(pasajero14);
	pasajeros.add(pasajero15);
	pasajeros.add(pasajero16);
	pasajeros.add(pasajero17);
	pasajeros.add(pasajero18);
	pasajeros.add(pasajero19);
	pasajeros.add(pasajero20);

	HashSet<Conductor> conductores = new HashSet<Conductor>();
	conductores.add(conductor1);
	conductores.add(conductor2);
	conductores.add(conductor3);
	conductores.add(conductor4);
	conductores.add(conductor5);
	conductores.add(conductor6);
	conductores.add(conductor7);
	conductores.add(conductor8);
	conductores.add(conductor9);
	conductores.add(conductor10);

	/* Viajes */
	Viaje v1 = new Viaje(conductor1, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v2 = new Viaje(conductor1, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v3 = new Viaje(conductor2, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v4 = new Viaje(conductor2, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v5 = new Viaje(conductor2, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v6 = new Viaje(conductor3, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v7 = new Viaje(conductor3, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v8 = new Viaje(conductor4, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v9 = new Viaje(conductor4, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));
	Viaje v10 = new Viaje(conductor5, pasajeros, "origen", "destino", java.sql.Date.valueOf(today.minusDays(5)));

	HashSet<Viaje> viajes = new HashSet<Viaje>();
	viajes.add(v1);
	viajes.add(v2);
	viajes.add(v3);
	viajes.add(v4);
	viajes.add(v5);
	viajes.add(v6);
	viajes.add(v7);
	viajes.add(v8);
	viajes.add(v9);
	viajes.add(v10);
	Muber muber = new Muber(pasajeros,conductores,viajes);
	
	return muber;
 }
  
}

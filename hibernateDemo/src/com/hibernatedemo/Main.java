package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		Session session = factory.getCurrentSession();

	try{
		session.beginTransaction();
		//HQL --> Hibernate Qery Language
		//Select * from city
		//"from City c where c.countryCode='TUR' AND c.countryCode='Ankara'"
		//"from City c where c.name LIKE '%kar%' "
		//ASC-Ascending
		//DESC - Descending -tersten sýralamak için-
		/*
		 * List<String> contryCodes =
		 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
		 * ).getResultList();
		 * 
		 * for(String countryCode:contryCodes) { System.out.println(contryCodes); }
		 * 
		 */
		
		
//		//INSERT
//		City city = new City();
//		city.setName("Düzce 10");
//		city.setCountryCode("TUR");
//		city.setDistrict("karadeniz");
//		city.setPopulation(100000);
//		session.save(city);

		
		//UPDATE
		//City city = session.get(City.class, 4086);
		//city.setPopulation(110000);
		//session.save(city);
		
		//CRUD Create Read Update Delete
		
		//DELETE
		City city = session.get(City.class, 4086);
		session.delete(city);
		
		
		session.getTransaction().commit();
		 System.out.println("Þehir silindi");
	}finally {
		factory.close();
	}
		
	}

}

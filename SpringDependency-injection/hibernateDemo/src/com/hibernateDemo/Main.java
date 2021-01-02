package com.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try 
		{
			//Unit Of Work
			session.beginTransaction();
			
			//List<City> cities = session.createQuery("from City").getResultList(); //SELECt * FROM City
			//List<City> cities = session.createQuery("from City c Where c.countryCode='TUR'").getResultList();
			//List<City> cities = session.createQuery("from City c Where c.countryCode='TUR' OR c.countryCode='USA'").getResultList();
			//List<City> cities = session.createQuery("from City c Where c.name LIKE  '%tan%' ").getResultList();
			//List<City> cities = session.createQuery("from City c ORDER BY c.name ASC ").getResultList();
			//List<City> cities = session.createQuery("from City c ORDER BY c.name ASC ").getResultList();
			//List<City> cities = session.createQuery("from City c GROUP BY c.name ORDER BY c.name").getResultList();
			/*
			 * for(City city: cities) { System.out.println(city.getName()); }
			 */
			
			
			//INSERT - ekleme iþlemi
//			City city = new City("iztanbul","TUR","Marmara",123456789);
//			session.save(city);
			
			//UPDATE - güncelleme iþlemi
//			City city = session.get(City.class,4089); //1.alan tablo, 2.alan ID
//			city.setName("istanbuldasonbahar");
//			session.save(city);
			
			//DELETE - silme iþlemi
			City city = session.get(City.class, 4089);
			session.delete(city);
			
			
			
			session.getTransaction().commit();
			System.out.print("Þehir eklendi");
		}
		finally 
		{
			factory.close();
		}
	}
	

}

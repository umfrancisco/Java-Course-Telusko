package com.umfrancisco;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(com.umfrancisco.Laptop.class)
				.configure()
				.buildSessionFactory();
		
		Session session = sf.openSession();
		
		// select * from laptop where ram = 32 -> SQL
		// from Laptop where ram = 32 -> HQL
		
		Query<Laptop> query = session.createQuery("from Laptop", Laptop.class);
		List<Laptop> laptops = query.getResultList();
		
		for (Laptop l : laptops) {
			System.out.println(l);
		}
		
		session.close();
		sf.close();
	}
}

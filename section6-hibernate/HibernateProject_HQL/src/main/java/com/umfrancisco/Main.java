package com.umfrancisco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(com.umfrancisco.Laptop.class)
				.configure()
				.buildSessionFactory();
		
		Session session = sf.openSession();
		
		var l1 = session.find(Laptop.class, 2);
		System.out.println(l1);
		
		Session session1 = sf.openSession();
		var l2 = session1.find(Laptop.class, 2);
		System.out.println(l2);
		
		session1.close();
		session.close();
		sf.close();
	}
}

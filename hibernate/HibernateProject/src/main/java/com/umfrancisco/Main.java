package com.umfrancisco;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Student s2 = null;
		
		SessionFactory sf = new Configuration()
				.addAnnotatedClass(com.umfrancisco.Student.class)
				.configure()
				.buildSessionFactory();
		
		Session session = sf.openSession();
		s2 = session.find(Student.class, 543);
		
		session.close();
		sf.close();
		
		System.out.println(s2);
	}
}

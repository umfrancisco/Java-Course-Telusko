package com.umfrancisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj1 = context.getBean(Alien.class);
		System.out.println(obj1.getAge());
		obj1.code();
		
//		Computer com = context.getBean(Computer.class);
//		Desktop obj2 = context.getBean(Desktop.class);
		
		
	}
}

package com.umfrancisco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.umfrancisco.config.AppConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Desktop desktop = context.getBean(Desktop.class);
		desktop.compile();
	}
}

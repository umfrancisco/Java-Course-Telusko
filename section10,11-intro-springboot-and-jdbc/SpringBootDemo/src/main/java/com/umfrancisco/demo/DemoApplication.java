package com.umfrancisco.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.umfrancisco.demo.model.Laptop;
import com.umfrancisco.demo.service.LaptopService;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);
	}
	
}

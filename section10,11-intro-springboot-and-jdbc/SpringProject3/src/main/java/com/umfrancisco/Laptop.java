package com.umfrancisco;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	
	public Laptop() {
		System.out.println("Laptop Object created");
	}
	
	public void compile() {
		System.out.println("Compiling using laptop");
	}
}

package com.umfrancisco;

public class Laptop implements Computer {
	
	public Laptop() {
		System.out.println("Laptop Object created");
	}
	
	public void compile() {
		System.out.println("Compiling using laptop");
	}
}

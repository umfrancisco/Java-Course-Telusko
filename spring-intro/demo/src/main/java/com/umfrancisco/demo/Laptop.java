package com.umfrancisco.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	public void compile() {
		System.out.println(this.getClass().getName()+"::compile");			
	}
}

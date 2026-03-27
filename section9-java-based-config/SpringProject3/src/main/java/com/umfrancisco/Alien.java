package com.umfrancisco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("21")
	private int age;
	
	@Autowired
	private Computer computer;
	
	public Alien() {
		System.out.println("Alien Object created");
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public Computer getComputer() {
		return computer;
	}
	
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void code() {
		System.out.println("Coding");
		computer.compile();
	}
}

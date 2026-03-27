package com.umfrancisco.demo.repository;

import org.springframework.stereotype.Repository;

import com.umfrancisco.demo.model.Laptop;

@Repository
public class LaptopRepository {
	
	public void save(Laptop laptop) {
		System.out.println("Saved in database");
	}
}

package com.umfrancisco.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.umfrancisco.demo.model.Laptop;
import com.umfrancisco.demo.repository.LaptopRepository;

@Service
public class LaptopService {
	
	@Autowired
	private LaptopRepository repository;
	
	public void addLaptop(Laptop laptop) {
		repository.save(laptop);
	}
	
	public boolean isGoodForProgramming(Laptop laptop) {
		return true;
	}
}

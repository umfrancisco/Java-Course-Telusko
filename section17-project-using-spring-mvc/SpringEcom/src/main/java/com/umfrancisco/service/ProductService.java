package com.umfrancisco.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.umfrancisco.model.Product;
import com.umfrancisco.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> getAllProducts() {
		return repository.findAll();
	}
	
	public Product getProductById(int id) {
		return repository.findById(id).orElse(new Product(-1));
	}
}

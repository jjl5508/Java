package com.jonathan.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jonathan.productsandcategories.models.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {
	List<Product> findAll();
	
}

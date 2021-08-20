package com.jonathan.productsandcategories.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jonathan.productsandcategories.models.Category;
import com.jonathan.productsandcategories.models.Product;

public interface CategoryRepo extends CrudRepository<Category, Long> {

	List<Category> findAll();
	
	List<Category> findAllByProducts(Product product);
	
	List<Category> findByProductsNotContains(Product product);
}

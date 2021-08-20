package com.jonathan.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.productsandcategories.models.Product;
import com.jonathan.productsandcategories.repositories.ProductRepo;

@Service
public class ProductService {
	@Autowired
	private ProductRepo productRepo;
//	Find all
	public List<Product> allProducts() {
		return productRepo.findAll();
	}
	
//	Save Product
	public Product saveProduct(Product p) {
		return productRepo.save(p);
	}
	
//	Find one
	public Product findProduct(Long product_id) {
		return productRepo.findById(product_id).orElse(null);
	}
	
}

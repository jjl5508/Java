package com.jonathan.productsandcategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonathan.productsandcategories.models.Category;
import com.jonathan.productsandcategories.models.Product;
import com.jonathan.productsandcategories.repositories.CategoryRepo;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;
	
	public List<Category> allCategories() {
		return categoryRepo.findAll();
	}
	public Category saveCategory(Category c) {
		return categoryRepo.save(c);
	}
	public Category findCategory(Long category_id) {
		return categoryRepo.findById(category_id).orElse(null);
	}
	public List<Category> categoriesExcludingProduct(Product p) {
		return categoryRepo.findByProductsNotContains(p);
	}
}

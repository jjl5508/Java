package com.jonathan.productsandcategories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jonathan.productsandcategories.models.Category;
import com.jonathan.productsandcategories.models.Product;
import com.jonathan.productsandcategories.services.CategoryService;
import com.jonathan.productsandcategories.services.ProductService;

@Controller
public class MainController {
	
	@Autowired
	private ProductService productServ;
	
	@Autowired CategoryService categoryServ;
	
	
	@GetMapping("/")
	public String index(
			@ModelAttribute("productObj") Product emptyObj
	) {
		return "index.jsp";
	}
	
	@PostMapping("/products/new")
	public String newProd(
			@ModelAttribute("productObj") Product filledObj
	) {
		productServ.saveProduct(filledObj);
		return "redirect:/";
	}
	
	
	@GetMapping("/categories/new")
	public String newCat(
			@ModelAttribute("categoryObj") Category emptyCategory
	) {
		return "category.jsp";
	}
	
	@PostMapping("/categories/new")
	public String newProd(
			@ModelAttribute("categoryObj") Category filledCategory
	) {
		categoryServ.saveCategory(filledCategory);
		return "redirect:/";
	}
	
	// -------------------- CREATING THE RELATINOSHP --------------//
	@GetMapping("/products/{id}")
	public String oneProduct(
			@PathVariable("id") Long prod_id, Model model
	) {
		Product oneProduct = productServ.findProduct(prod_id);
		model.addAttribute("product", oneProduct);
		model.addAttribute("categories", categoryServ.categoriesExcludingProduct(oneProduct));
		
		return "product.jsp";
	}
	
	@PostMapping("/products/{id}")
	public String addCategoryToProduct(
			@PathVariable("id") Long prod_id,
			@RequestParam("category_id") Long cat_id
	) {
		// USING THE IDS, FIND PRODUCT AND CATEGORY OBJ
		Category oneCat = categoryServ.findCategory(cat_id);
		Product oneProd = productServ.findProduct(prod_id);
		
		// ADD THE RELATIONSHIP TO THE OBJECTS
		oneCat.getProducts().add(oneProd);
//		oneProd.getCategories().add(oneCat);
		
		// SAVE THE NEW INFORMATION IN THE DB
		categoryServ.saveCategory(oneCat);
//		mainServ.saveProduct(oneProd);
		
		return "redirect:/products/" + prod_id;
		
	}
	
	
	
	
	
}
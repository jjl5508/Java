package com.jonathan.human.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumansController {
	@RequestMapping("/")
	public String index() {
		return "Hello Human!";
				
	}
	@RequestMapping("/name={name}")
	public String human(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	
}

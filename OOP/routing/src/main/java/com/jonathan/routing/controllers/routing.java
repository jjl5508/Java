package com.jonathan.routing.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class routing {
	@RequestMapping("")
	public String index() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/python")
	public String snake() {
		return "Python/Django was awesome!";
	}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}

}


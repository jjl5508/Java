package com.jonathan.dojoandfun.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/dojos/new")
	public String index() {
		return "index.jsp";
	}
}

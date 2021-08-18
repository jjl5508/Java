package com.jonathan.displaytime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@PostMapping("/results")
	public String results(@RequestParam("name") String name, @RequestParam("locations") String locations, @RequestParam("lang") String lang, @RequestParam("comments") String comments, Model model, RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("name", name);
		redirectAttributes.addFlashAttribute("locations", locations);
		redirectAttributes.addFlashAttribute("lang", lang);
		redirectAttributes.addFlashAttribute("comments", comments);
		return "redirect:/new_results";
	}
	
	@GetMapping("/new_results")
	public String newResults() {
		return "results.jsp";
	}
}

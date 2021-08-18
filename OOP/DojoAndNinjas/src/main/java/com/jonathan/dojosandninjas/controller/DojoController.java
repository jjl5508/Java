package com.jonathan.dojosandninjas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.jonathan.dojosandninjas.models.Dojo;
import com.jonathan.dojosandninjas.services.DojoService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoService dojoServ;
	
	@GetMapping("/dojos/new")
	public String index(@ModelAttribute("dojoObj") Dojo dojo, Model model) {
		List<Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("dojos", allDojos);
		return "dojo_create.jsp";
	}
	@PostMapping("/dojos/new")
	public String create(@ModelAttribute("dojoObj") Dojo filleddojo) {
		dojoServ.saveDojo(filleddojo);
		return "redirect:/dojos/new";
	}
}

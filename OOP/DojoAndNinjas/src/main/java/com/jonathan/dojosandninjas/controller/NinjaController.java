package com.jonathan.dojosandninjas.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jonathan.dojosandninjas.models.Dojo;
import com.jonathan.dojosandninjas.models.Ninja;
import com.jonathan.dojosandninjas.services.DojoService;
import com.jonathan.dojosandninjas.services.NinjaService;

@Controller
public class NinjaController {
	@Autowired
	private NinjaService ninjaServ;
	@Autowired
	private DojoService dojoServ;

	@GetMapping("/ninjas/new")
	public String index(Model model) {
		List<Dojo> allDojos = dojoServ.allDojos();
		model.addAttribute("dojos", allDojos);
		model.addAttribute("ninjaObj", new Ninja());
		return "ninja_create.jsp";
	}
	
	
	@RequestMapping(value="/ninjas/new/post", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("ninjaObj") Ninja ninjaObj, BindingResult result, @RequestParam (value="dojo")String dojo) {
		System.out.println(dojo);
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "ninja_create.jsp";
		}
		ninjaServ.saveNinja(ninjaObj);
		return "redirect:/ninjas/new";
	}
//	Hihi
}

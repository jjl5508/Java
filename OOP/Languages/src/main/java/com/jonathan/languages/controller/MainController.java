package com.jonathan.languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.jonathan.languages.models.Languages;
import com.jonathan.languages.services.LangService;

@Controller
public class MainController {
	
	@Autowired
	private LangService langServ;
	
	@GetMapping("/languages")
	public String index(@ModelAttribute("langObj")Languages emptyLanguage, Model model) {
		List<Languages> allLanguages = langServ.allLang();
		model.addAttribute("languages",allLanguages);
		
		return "dash.jsp";
	}
	@PostMapping("/languages") 
		public String create(@Valid @ModelAttribute("langObj") Languages filledLanguage, BindingResult results, Model model) {
		
		if(results.hasErrors()) {
			List<Languages> allLanguages = langServ.allLang();
			model.addAttribute("languages",allLanguages);
			return "dash.jsp";
		}
		else {
			langServ.saveLang(filledLanguage);
			return "redirect:/languages";
		}
	} 

	@GetMapping("languages/{id}/edit")
	public String edit(@PathVariable("id") Long language_id, Model model) {
		Languages onelanguage = langServ.findOneLang(language_id);
		model.addAttribute("langObj", onelanguage);
		return "edit.jsp";
	}
	
	@PutMapping("languages/{id}/edit")
	public String update(@Valid @ModelAttribute("langObj") Languages filledLanguage, BindingResult results) {
		if(results.hasErrors()) {
			
			return "edit.jsp";
		}
		else {
			langServ.saveLang(filledLanguage);
			return "redirect:/languages";
		}
	}
	@GetMapping("/languages/{id}")
	public String onelang(@PathVariable("id") Long language_id, Model model) {
		Languages onelang = langServ.findOneLang(language_id);
		model.addAttribute("lang", onelang);
		return "show.jsp";
	}
	
	@GetMapping("languages/{id}/delete")
	public String delete(@PathVariable("id") Long language_id, Model model) {
		langServ.deleteLang(language_id);
		return "redirect:/languages";
	}
}

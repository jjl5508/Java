package com.jonathan.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jonathan.languages.models.Languages;
import com.jonathan.languages.repositories.LangRepo;

@Service
public class LangService {
	private final LangRepo langRepo;
	
	public LangService(LangRepo langRepo) {
		this.langRepo = langRepo;
	}
	
//	Create
	public Languages saveLang(Languages lang) {
		return langRepo.save(lang);
	}
// Find all
	public List<Languages> allLang(){
		return langRepo.findAll();
	}
//Find one
	public Languages findOneLang(Long id) {
		return langRepo.findById(id).orElse(null);
	}
//Delete
	public void deleteLang(Long id) {
		langRepo.deleteById(id);
	}
}

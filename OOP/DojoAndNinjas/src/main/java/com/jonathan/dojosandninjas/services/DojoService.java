package com.jonathan.dojosandninjas.services;

import java.util.List;


import org.springframework.stereotype.Service;

import com.jonathan.dojosandninjas.models.Dojo;
import com.jonathan.dojosandninjas.repositories.DojoRepo;


@Service
public class DojoService {
	
	private final DojoRepo dojoRepo;
	
	public DojoService(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
//	Create
	public Dojo saveDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
	
// Find All
	public List<Dojo> allDojos() {
		return dojoRepo.findAll();
	}

// Find One
	public Dojo findOneDojo(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}

// Delete
	public void deleteDojo(Long id) {
		dojoRepo.deleteById(id);
	}

}

package com.jonathan.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jonathan.dojosandninjas.models.Ninja;
import com.jonathan.dojosandninjas.repositories.NinjaRepo;

@Service
public class NinjaService {

	private final NinjaRepo ninjaRepo;
	
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
//	Create
	public Ninja saveNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
//	Find All
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
//	Find One
	public Ninja findOneNinja(Long id) {
		return ninjaRepo.findById(id).orElse(null);
	}
//	Delete
	public void deleteNinja(Long id) {
		ninjaRepo.deleteById(id);
	}
}

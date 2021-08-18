package com.jonathan.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jonathan.dojosandninjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	List <Ninja> findAll();
}

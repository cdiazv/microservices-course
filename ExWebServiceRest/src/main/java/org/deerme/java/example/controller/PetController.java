package org.deerme.java.example.controller;

import java.util.List;

import org.deerme.java.example.model.Pet;
import org.deerme.java.example.service.PetService;
import org.deerme.java.example.service.PetServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

	@Autowired
	PetService petService;

	@RequestMapping(value = "/pets", method = { RequestMethod.GET }, produces = { MediaType.APPLICATION_JSON_VALUE })
	public List<Pet> findAll() {

		return petService.findAll();
	}

	@RequestMapping(value = "/pets/{id}", method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	public Pet findById(@PathVariable("id") int id) throws PetServiceException {
		return petService.findById(id);
	}

}

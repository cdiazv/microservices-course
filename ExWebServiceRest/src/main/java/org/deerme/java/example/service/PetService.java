package org.deerme.java.example.service;

import java.util.ArrayList;
import java.util.List;

import org.deerme.java.example.model.Animal;
import org.deerme.java.example.model.Pet;
import org.springframework.stereotype.Service;

/**
 * PetService
 * 
 * This layer contain the access to the pet's operation. This a example, all
 * data it's hardcode.
 * 
 * @author 1066121
 *
 */

@Service
public class PetService {

	List<Pet> pets;

	public List<Pet> findAll() {
		if (pets == null) {
			pets = new ArrayList<Pet>();
			pets.add(new Pet(1, "Cachupin", new Animal("Perro")));
			pets.add(new Pet(2, "Tomas", new Animal("Gato")));
			pets.add(new Pet(3, "Luis", new Animal("Loro")));
		}
		return pets;

	}

	public Pet findById(int id) throws PetServiceException {

		for (Pet pet : findAll()) {
			if (pet.getId() == id) {
				return pet;
			}
		}

		throw new PetServiceException("Don't exits the pet with " + id + "key");
	}

}

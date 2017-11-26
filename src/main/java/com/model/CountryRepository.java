package com.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.entities.Country;

public interface CountryRepository extends MongoRepository<Country, String> {
	Country findByName(String name);

}

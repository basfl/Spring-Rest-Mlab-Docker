package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Country;
import com.model.CountryRepository;

@RestController
@RequestMapping("/rest")
public class RestResource {
	// /rest/country/iran
	@Autowired
	CountryRepository cr;

	@RequestMapping("/country/{name}")
	public String getAdd(@PathVariable("name") String name) {
	//	List<Country> countries = cr.findAll();
		Country rs = cr.findByName(name);
		return "The capital of "+ name +" is "+rs.getCapital();
	}

}

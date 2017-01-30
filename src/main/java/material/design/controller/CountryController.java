package material.design.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import material.design.model.Country;
import material.design.repository.CountryRepository;

@Controller
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountryRepository repository;
	
	@GetMapping
	public String show(Model model) {
		List<Country> countries = repository.findAll();	
		model.addAttribute("country", new Country());
		model.addAttribute("countries", countries);		
		return "countries";
	}
	
	@PostMapping("/save")
	public String save(Country country) {
		Country newCountry = repository.saveAndFlush(country);
		return "redirect:/country";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable long id) {
		repository.delete(id);
		return "redirect:/country";		
	}

}

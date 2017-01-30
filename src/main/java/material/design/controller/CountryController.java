package material.design.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	public String save(Country country, RedirectAttributes model) {
		Country newCountry = repository.saveAndFlush(country);
		model.addFlashAttribute("toast", "New item saved: " + newCountry.toString());
		return "redirect:/country";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable long id, RedirectAttributes model) {
		repository.delete(id);
		model.addFlashAttribute("toast", "Item with id = " + id + " was deleted.");
		return "redirect:/country";		
	}
	
	@GetMapping("/update/{id}")
	public String showUpdate(@PathVariable long id, Model model) {
		Country existingCountry = repository.findOne(id);
		model.addAttribute("country", existingCountry);				
		return "update";
	}
	
	@PostMapping("/update")
	public String update(Country updates, RedirectAttributes model) {	
		
		repository.saveAndFlush(updates);
		model.addFlashAttribute("toast", "Item updated");
				
		return "redirect:/country";
	}
	
	

}

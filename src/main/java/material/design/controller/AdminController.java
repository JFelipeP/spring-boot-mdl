package material.design.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import material.design.model.Users;
import material.design.repository.UsersRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UsersRepository repository;
	
	@GetMapping
	public String showUsers(Model model) {
		List<Users> usrs = repository.findAll();
		model.addAttribute("users", usrs);
		model.addAttribute("user", new Users());
		model.addAttribute("message", "admin page");
		return "users";
	}
	
	

}

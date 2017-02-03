package material.design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String home(Model model) {
		model.addAttribute("message", "Material Design Lite");		
		return "home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

}

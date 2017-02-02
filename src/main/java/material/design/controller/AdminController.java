package material.design.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import material.design.model.AdminFormData;
import material.design.model.Authorities;
import material.design.model.Users;
import material.design.model.UsersAndAuthorities;
import material.design.repository.AuthoritiesRepository;
import material.design.repository.UsersRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private AuthoritiesRepository authoritiesRepository;
	
	@GetMapping
	public String showUsers(Model model) {		
		model.addAttribute("edit", false);
		model.addAttribute("users", usersRepository.JdbcFindUsersWithAuthorities());		
		model.addAttribute("adminFormData", new AdminFormData(null, null, "ROLE_USER", true));
		return "users";
	}
	
	@PostMapping("/save")
	public String save(AdminFormData form) {
		
		Users userToSave = new Users(form.getUsername(), form.getPassword(), form.isEnabled());
		System.out.println(userToSave);
		Users usr = usersRepository.saveAndFlush(userToSave);
		Authorities auth = authoritiesRepository.saveAndFlush(new Authorities(form.getUsername(), form.getAuthority()));
		return "redirect:/admin";
	}
	
	
	@ResponseBody
	@GetMapping("/showall")
	public List<UsersAndAuthorities> showAll() {
		return usersRepository.JdbcFindUsersWithAuthorities();
	}
	
	

}

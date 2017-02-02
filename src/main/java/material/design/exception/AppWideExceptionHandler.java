package material.design.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {
	
	@ExceptionHandler(UsernameAlreadyInUseException.class)	
	public String usernameException(Model model) {
		model.addAttribute("message", "username already in use, please choose another one");
		return "error/usernameException";
	}

}

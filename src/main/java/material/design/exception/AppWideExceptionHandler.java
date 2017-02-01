package material.design.exception;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {
	
//	@ExceptionHandler(SQLException.class)	
//	public String handleSqlException() {
//		return "handleSqlError";
//	}

}

package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExeptionHandler {
 
	
	@SuppressWarnings("rawtypes")
	@ExceptionHandler(RegistrationNotFoundException.class)
	public ResponseEntity<ErrorMessage>handleEmployeeNotFoundException(RegistrationNotFoundException ex){
		ErrorMessage error=new ErrorMessage();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setErrorMessage(ex.getMessage());
		return new ResponseEntity(error,HttpStatus.OK);
	}
}

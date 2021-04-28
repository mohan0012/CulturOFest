package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(EventNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleEventNotFoundException(EventNotFoundException ex)
	{
		ErrorMessage error =new ErrorMessage();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setErrorMessage(ex.getMessage());
		
		return new ResponseEntity(error,HttpStatus.OK);
		
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity handleException(Exception ex)
	{
		return new ResponseEntity(ex.getMessage(),HttpStatus.BAD_REQUEST);
	}
	
	}

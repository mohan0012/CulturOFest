package com.cg.exception;


public class InvalidDetailsException extends Exception{

	private String message;

	public InvalidDetailsException(String message) {
		super();
		this.message = message;
	}
	
	public InvalidDetailsException() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidDetailsException [message=" + message + "]";
	}
	
}

package com.cg.service;

import java.util.Optional;

import com.cg.exception.InvalidDetailsException;
import com.cg.model.Login;


public interface LoginService {

	public Optional<Login> getLoginByName(String name);
    public boolean authenticate(Login login) throws InvalidDetailsException;

	   
	   
	   public Login add(Login login) throws InvalidDetailsException;
}

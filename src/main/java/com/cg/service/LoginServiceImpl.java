package com.cg.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.InvalidDetailsException;
import com.cg.model.Login;
import com.cg.repository.LoginRepository;


@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginRepository loginRepo;
	
	@Override
	public Optional<Login> getLoginByName(String name) {
		return null;

	}

	@Override
	public boolean authenticate(Login login) throws InvalidDetailsException {
		Login login1=(Login) loginRepo.findByUsername(login.getUsername());
		if(((login1.getUsername()).equals(login.getUsername())) && (login.getPassword().equals(login1.getPassword()))) 
				{
			       return true;
				}
		return false;
		}

	

	@Override
	public Login add(Login login) throws InvalidDetailsException {
		return loginRepo.save(login);
	}

}

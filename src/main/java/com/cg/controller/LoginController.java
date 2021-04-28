package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.exception.InvalidDetailsException;
import com.cg.model.Login;
import com.cg.repository.LoginRepository;
import com.cg.service.LoginService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LoginController {
	@Autowired
	private LoginService loginServ;
	 @Autowired
	 private	LoginRepository loginRepo;
	
	@PostMapping("/add")
	public Login addAdmin( @RequestBody Login login) throws InvalidDetailsException {
		return loginServ.add(login);
	}
	
    @GetMapping("/authenticate")
    public String authenticate(@RequestBody Login login) throws InvalidDetailsException{
  			boolean status=loginServ.authenticate(login);
  			if(status) 
				return "success";
			else
				return "fail";
  		}
}

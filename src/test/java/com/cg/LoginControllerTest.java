package com.cg;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.cg.exception.InvalidDetailsException;
import com.cg.model.Login;
import com.cg.repository.LoginRepository;
import com.cg.service.LoginService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginControllerTest {
	
	  @Autowired LoginService loginServ;
	  
	  @MockBean LoginRepository loginRepo;
	  
	  @Test void testAddAdmin() throws InvalidDetailsException 
	  { 
		  Login login = new Login(); 
		  login.setAdminid((long) 1); 
		  login.setUsername("ayushi");
	      login.setPassword("ayushi");
	      when(loginRepo.save(login)).thenReturn(login);
	      assertEquals(login, loginServ.add(login));
	  }
	  
	  @SuppressWarnings("unchecked")
	@Test void testAuthenticate() throws InvalidDetailsException 
	  { 
		  Login login = new Login(); 
		  login.setAdminid((long) 1); 
		  login.setUsername("ayushi");
	      login.setPassword("ayushi");
	  
	     
	      Mockito.when(loginRepo.findByUsername("ayushi")).thenReturn((List<Login>) login);
	      assertThat(loginServ.authenticate(login)).isEqualTo(true);
	  
	  }
	  
	  
}
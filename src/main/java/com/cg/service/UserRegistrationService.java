package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.model.UserRegistration;

public interface UserRegistrationService
{
	public UserRegistration addUserDetails(UserRegistration entity);
	
	public List<UserRegistration> getAllUsers();
	
	//public List<UserRegistration> listAll(String keyword);
   
	public List<UserRegistration> findByEventName(String eventName);

	public Optional<UserRegistration> getUserById(Long Id);

	public List<UserRegistration> findByFirstName(String firstName);

	public void deleteUserDetails(UserRegistration data);
	
	

}

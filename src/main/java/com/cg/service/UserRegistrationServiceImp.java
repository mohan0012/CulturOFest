package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.UserRegistration;
import com.cg.repository.UserRegistrationRepository;

@Service
public class UserRegistrationServiceImp implements UserRegistrationService{

	@Autowired
	public UserRegistrationRepository repo;
	
	@Override
	public UserRegistration addUserDetails(UserRegistration entity) {
		
		return repo.save(entity);
	}

	@Override
	public List<UserRegistration> getAllUsers() {
		return repo.findAll();
	}


	@Override
	public void deleteUserDetails(UserRegistration data) {
		repo.delete(data);
		
		
	}

	@Override
	public Optional<UserRegistration> getUserById(Long Id) {
		
		return repo.findById(Id);
}

	@Override
	public List<UserRegistration> findByFirstName(String firstName) {
		
		return repo.findByFirstName(firstName);
	}


	@Override
	public List<UserRegistration> findByEventName(String eventName) {
		
		return repo.findByEventName(eventName);
	}

//	@Override
//	public List<UserRegistration> listAll(String keyword) {
//		   return repo.findAll(keyword);
//	  
//	}
	
	

	 
}

package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.model.UserRegistration;

@Repository
public interface UserRegistrationRepository extends JpaRepository<UserRegistration,Long> {
   
	
	public List<UserRegistration> findByFirstName(String firstName);
	
	public List<UserRegistration> findByEventName(String eventName);
	
}

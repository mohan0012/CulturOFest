package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.UserRegistration;
import com.cg.exception.RegistrationNotFoundException;
import com.cg.service.UserRegistrationServiceImp;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
@CrossOrigin(origins="http://localhost:3000")

@RestController
@Slf4j
public class UserRegistrationController 
{
  @Autowired
  public  UserRegistrationServiceImp service;
 
 final Logger log=(Logger) org.slf4j.LoggerFactory.getLogger(UserRegistrationController.class);
 
  @PostMapping("/user/all")
   public UserRegistration createUser(@RequestBody UserRegistration data) {
	log.info("saves new user details"+data.toString());
    return service.addUserDetails(data);  
  }
   
  @GetMapping("/user/all")
  public List<UserRegistration> allUsers(){
	  log.info("Display all users list");
	  return service.getAllUsers();
  }
  
  @DeleteMapping("/user/all/{id}")
  public String deleteUser(@PathVariable(value="id") long redId ) throws RegistrationNotFoundException {
   UserRegistration user = service.getUserById(redId).orElseThrow(()-> new RegistrationNotFoundException("Registration Not Found for this id:"));
	service.deleteUserDetails(user);
	log.info("Delete the user");
	return "Details deleted!!!!";
  }
 
  @GetMapping("/user/alll/{id}")
  public ResponseEntity<UserRegistration> viewuser(@PathVariable Long id) throws RegistrationNotFoundException{
	  UserRegistration user = service.getUserById(id).orElseThrow(()->new RegistrationNotFoundException("User not found !!"));
	  log.info("Dispaly the user details"+user.toString());
	  return ResponseEntity.ok().body(user);
  }
  
  @GetMapping("/user/all/{name}")
  public List<UserRegistration> findUserByName(@PathVariable(value="name") String uname){
	log.info("Dispaly the user details by name");
	return service.findByFirstName(uname);
	  
  }  
  
  @GetMapping("/user/al/{name}")
  public List<UserRegistration> findUserByEventName(@PathVariable(value="name") String uname){
	log.info("Dispaly the user details by Event Name");
	return service.findByEventName(uname);
  }

  
}

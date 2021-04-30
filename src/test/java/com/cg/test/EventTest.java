package com.cg.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.exception.EventNotFoundException;
import com.cg.model.Event;
import com.cg.model.UserRegistration;
import com.cg.repository.EventRepository;
import com.cg.service.EventService;
import com.cg.service.UserRegistrationService;



@SpringBootTest
public class EventTest {
	
	@Autowired
	EventService ser;
	
	@MockBean
	EventRepository repo;
	
	
	@Test
	public void testGetAllEvent() throws EventNotFoundException{
		Event event=new Event();
		event.setAmount(2300);
		event.setDescription("All age group allowed");
		event.setEndTime("8PM");
		event.setEventDate("04/06/2021");
		event.setId(12);
		event.setImage("image");
		event.setName("Holi");
		event.setStartTime("11AM");
		event.setVenue("Rishikesh");
		
		Event event1=new Event();
		event1.setAmount(3300);
		event1.setDescription("All age group allowed");
		event1.setEndTime("7PM");
		event1.setEventDate("11/11/2021");
		event1.setId(13);
		event1.setImage("image");
		event1.setName("Diwali");
		event1.setStartTime("4PM");
		event1.setVenue("Delhi");
		
		List<Event> eventList= new ArrayList<>();
		eventList.add(event1);
		eventList.add(event);
		
		Mockito.when(repo.findAll()).thenReturn(eventList);
		assertThat(ser.getAllEvent()).isEqualTo(eventList);
		
	}
	
	@Test
	public void testGetById() throws EventNotFoundException{
		
		Event event=new Event();
		event.setAmount(2300);
		event.setDescription("All age group allowed");
		event.setEndTime("8PM");
		event.setEventDate("04/06/2021");
		event.setId(12);
		event.setImage("image");
		event.setName("Holi");
		event.setStartTime("11AM");
		event.setVenue("Rishikesh");
		
		Optional<Event> event1= Optional.ofNullable(event);
		
		Mockito.when(repo.findById((long) 12)).thenReturn(event1);
		assertThat(ser.getEventById(12l)).isEqualTo(event);
		
		
	}
	
	
	
}
	/*@Test
    void contextLoads() {
    }
	
	  @Test 
	  public void addEventTest() { 
		  event.setName("Holi");
	  event.setAmount(5000); 
	  event.setVenue("Banglore");
	  ser.createEvent(event);
	  
	  }
	  @Test 
	  public void  createUserTest() { 
		  user.setFirstName("test");
	  user.setAdultsCount(2); 
	  user.setState("Andhra Pradesh");
	  userser.addUserDetails(user);
	  
	  }
	 
		
		  @Test public void getAllEvents() {
		  
		  assertEquals(event.getName(),"null");
		  assertNotEquals(event.getAmount(),"null");
		  
		  }
		 
	 	
		
		  @Test 
		  public void deleteEventTest() 
		  { 
		  Event event=new Event();
		  event.setId(1); 
		  ser.deleteEvent(event); 
		  }
		  
	  
	  @Test 
	  public void deleteUserDetailsTest() 
	  { 
      UserRegistration use=new UserRegistration();
	  use.setUserId((long) 7); 
	  userser.deleteUserDetails(user); 
	  }*/
	  
		  
		 
	


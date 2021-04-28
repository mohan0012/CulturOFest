package com.cg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.cg.model.*;
import com.cg.service.EventService;

@SpringBootTest
class EventApplicationTests {
	@Autowired
	private Event event;
	@Autowired
	private EventService ser;
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void addEventTest()
	{
		event.setName("chackde");
		event.setAmount(5000);
		event.setVenue("Banglore");
		
		ser.createEvent(event);
		
		assertEquals(event.getName(),"chackde");
		assertNotEquals(event.getAmount(),1000);
		
	}
	
	@Test
	public void deleteEventTest() {
		Event event=new Event();
		event.setId(22);
		ser.deleteEvent(event);	
	}
	
	@Test
	public void getEventById() {
		event.setName("chackde");
		event.setAmount(5000);
		event.setVenue("Banglore");
		
		ser.createEvent(event);
		
		Long eventId=event.getId();
		
		ser.getEventById(eventId);
		
		assertEquals(event.getVenue(),"Banglore");
		
	}

	
	
}

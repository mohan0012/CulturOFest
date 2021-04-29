/*package com.cg;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;


import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.exception.EventNotFoundException;
import com.cg.model.*;
import com.cg.repository.EventRepository;
import com.cg.service.EventService;

@SpringBootTest
class EventApplicationTests {
   @MockBean
   	private EventRepository eventRepository;
   
	@Autowired
	private EventService eventService;
	
	
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void addEventTest() {
		Event e=new Event();
		e.setName("chackde");
		e.setAmount(90);
		e.setDescription("All age groups are allowed");
		e.setVenue("Hyderabad");
		e.setEventDate("22/09/2021");

		
		Mockito.when(eventRepository.save(e)).thenReturn(e);
        assertThat(eventService.createEvent(e)).isEqualTo(e);
		
		}
	
	
	
	@Test
	void deleventTest() {
	Event e=new Event();
	e.setId(10l);
	e.setName("chackde");
	e.setAmount(90);
	e.setDescription("All age groups are allowed");
	e.setVenue("Hyderabad");
	e.setEventDate("22/09/2021");
		
    eventService.deleteEvent(e);
	
}
}*/
	

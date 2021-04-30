package com.cg.service;

import java.util.Optional;
import java.util.List;

import com.cg.exception.EventNotFoundException;
import com.cg.model.Event;

public interface EventService {

	public Event createEvent(Event event);
	
	public void deleteEvent(Event event);
	
	public Event getEventById(long id) throws EventNotFoundException;
	 
	public List<Event> getEventByName(String name); 
	
	public List<Event> getAllEvent() throws EventNotFoundException;
	 	
	
}

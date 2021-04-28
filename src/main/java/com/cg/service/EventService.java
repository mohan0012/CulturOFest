package com.cg.service;

import java.util.Optional;
import java.util.List;

import com.cg.model.Event;

public interface EventService {

	public Event createEvent(Event event);
	
	public void deleteEvent(Event event);
	
	public Optional<Event> getEventById(long id);
	 
	public List<Event> getEventByName(String name); 
	 	
	
}

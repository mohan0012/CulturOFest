package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.Event;
import com.cg.repository.EventRepository;
@Service
public class EventServiceImpl implements EventService{

	@Autowired
	private EventRepository evtRepo;
	
	public Event createEvent(Event event) {
		
		return evtRepo.save(event);
	}

	public void deleteEvent(Event event) {
		evtRepo.delete(event);
	}

	
	  public Optional<Event> getEventById(long id) {
	  
	  return evtRepo.findById(id);
	  }
	  
	  public List<Event> getEventByName(String name)
		{
			return evtRepo.findByName(name);
		}

	

	
	  
	 

}

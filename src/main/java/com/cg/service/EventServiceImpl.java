package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.exception.EventNotFoundException;
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

	
	  
	  public List<Event> getEventByName(String name)
		{
			return evtRepo.findByName(name);
		}

	@Override
	public List<Event> getAllEvent() throws EventNotFoundException {
		List<Event> eventList= new ArrayList<>();
		eventList = evtRepo.findAll();
		if(eventList.isEmpty()) {
			throw new EventNotFoundException("Event Missing");
		}
		return eventList;
	}

	@Override
	public Event getEventById(long id) throws EventNotFoundException {
		Supplier<EventNotFoundException> supplier = ()-> new EventNotFoundException("Id missing");
		  return evtRepo.findById(id).orElseThrow(supplier);
	}

	

	
	  
	 

}

package com.cg.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


import com.cg.model.*;
import com.cg.repository.*;
import com.cg.service.*;
import com.cg.exception.*;
@CrossOrigin(origins="http://localhost:3000")
@RestController
//@RequestMapping("/api")
public class EventController {
	
	@Autowired
	  private EventService evtService;

	@Autowired
	private EventRepository evtRepo;

	 @PostMapping("/event")
	  public Event createEvent(@RequestBody Event e)
		{	System.out.println(e.toString());
			return evtService.createEvent(e);
		}
	 @DeleteMapping("/event/{id}")
	  public String deleteEvent(@PathVariable(value="id" )long evtid) throws EventNotFoundException
		{
		 	Event e=evtRepo.findById(evtid).orElseThrow(()->new EventNotFoundException("sorry!!! No Event found with that id"));
		 	evtService.deleteEvent(e);
		 	return "Event deleted";
		}
		
		 @GetMapping("/event")
		 public List<Event> getAllEvents(){ 
			 return evtRepo.findAll();
			 }
		 	
		  @GetMapping("/events/{id}")
		  public ResponseEntity<Event> getEventById(@PathVariable(value="id") long evtid) throws EventNotFoundException 
		  {
			  Event event=evtService.getEventById(evtid).orElseThrow(()->new EventNotFoundException("sorry!! no event found")); 
			  return ResponseEntity.ok().body(event);
	      }
		  @GetMapping("/event/{name}")
		    public List<Event> getEventByName(@PathVariable(value="name") String name)
		    {
				return  evtService.getEventByName(name);
		    }
}

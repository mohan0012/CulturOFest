package com.cg.model;

import javax.persistence.*;

import org.springframework.stereotype.Component;
//@Component
@Entity
@Table(name = "Event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	
	private String description;
	

	private String eventDate;

	private float amount;
	

	private String startTime;

	private String endTime;

	private String venue;
	
	private String image;

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Event(long id, String name, String description, String eventDate, float amount, String startTime,
			String endTime, String venue, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.eventDate = eventDate;
		this.amount = amount;
		this.startTime = startTime;
		this.endTime = endTime;
		this.venue = venue;
		this.image = image;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Event [id=" + id + ", name=" + name + ", description=" + description + ", eventDate=" + eventDate
				+ ", amount=" + amount + ", startTime=" + startTime + ", endTime=" + endTime + ", venue=" + venue
				+ ", image=" + image + "]";
	}

	

}

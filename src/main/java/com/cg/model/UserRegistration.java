package com.cg.model;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
//@Component
@Entity
@Table(name="user1")
public class UserRegistration 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;
	
     @Column(name = "user first name")
	 private String firstName;
	
	 @Column(name = "User Last Name")
	 private String lastName;
	 
	 @Column(name= "Event Name")
	 private String eventName;
	 
	 @Column(name = "User Address")
	 private String address;
	 
	 @Column(name = "City")
	 private String city;
	 
	 @Column(name ="State")
	 private String state;
	 
	 @Column(name = "User Age")
	 private int age;
	 
	 @Column(name = "User EmailId")
	 private String email;
	 
	 @Column(name = "User mobileNo")
	 private Long phoneNo;
	 
	 @Column(name = "Adults Count")
	 private int adultsCount;
	 
	 @Column(name = "Child Count")
	 private int childCount;
	 
	 @Column(name = "Food")
	 private String food;
	 
	 @Column(name = "All visitors names")
	 private String visitorsNames;
	 
	 @Column(name = "Total Amount")
	 private long totalPrice;
//	 
//	@ManyToMany(mappedBy="user")
//	private Set <Event>  event=new HashSet<>();
//	
	@OneToOne
	private  PaymentModel payment;
	
	 

	public UserRegistration() {
		super();
		
	}




	public UserRegistration(Long userid, String firstName, String lastName, String eventName, String address,
			String city, String state, int age, String email, Long phoneNo, int adultsCount, int childCount,
			String food, String visitorsNames, long totalPrice, PaymentModel payment) {
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eventName = eventName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.age = age;
		this.email = email;
		this.phoneNo = phoneNo;
		this.adultsCount = adultsCount;
		this.childCount = childCount;
		this.food = food;
		this.visitorsNames = visitorsNames;
		this.totalPrice = totalPrice;
	//	this.event = event;
		this.payment = payment;
	}








	public Long getUserId() {
		return userid;
	}

	public void setUserId(Long id) {
		this.userid = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getAdultsCount() {
		return adultsCount;
	}

	public void setAdultsCount(int adultsCount) {
		this.adultsCount = adultsCount;
	}

	public int getChildCount() {
		return childCount;
	}

	public void setChildCount(int childCount) {
		this.childCount = childCount;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getVisitorsNames() {
		return visitorsNames;
	}

	public void setVisitorsNames(String visitorsNames) {
		this.visitorsNames = visitorsNames;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}
	





//	public Set<Event> getEvent() {
//		return event;
//	}
//
//
//
//
//	public void setEvent(Set<Event> event) {
//		this.event = event;
//	}




	public Long getUserid() {
		return userid;
	}




	public void setUserid(Long userid) {
		this.userid = userid;
	}




	public PaymentModel getPayment() {
		return payment;
	}




	public void setPayment(PaymentModel payment) {
		this.payment = payment;
	}




	@Override
	public String toString() {
		return "UserRegistration [userid=" + userid + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", eventName=" + eventName + ", address=" + address + ", city=" + city + ", state=" + state + ", age="
				+ age + ", email=" + email + ", phoneNo=" + phoneNo + ", adultsCount=" + adultsCount + ", childCount="
				+ childCount + ", food=" + food + ", visitorsNames=" + visitorsNames + ", totalPrice=" + totalPrice
				+ ", payment=" + payment + "]";
	}




	

	

	

	
	
	
}

package com.cg.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component
@Entity
@Table(name="Payment_Table")
public class PaymentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long paymentId;
	
	 @Column(name="Total Amount")
	 private Long totalPrice;
	 
     @Column(name = "Payment Mode")
	 private String paymentMode;
	
     @Column(name="Card Holder Name")
     private String cardHolderName;
     
	 @Column(name ="CardNumber")
	 private Long cardNumber;
	 
	 @Column(name= "Expiry date")
	 private String date;
	 
	 @Column(name = "Cvv")
	 private long cvv;
	 
	 @OneToOne
	 private UserRegistration user;
	 

	public PaymentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public PaymentModel(Long paymentId, Long totalPrice, String paymentMode, String cardHolderName, Long cardNumber,
			String date, long cvv, UserRegistration user) {
		super();
		this.paymentId = paymentId;
		this.totalPrice = totalPrice;
		this.paymentMode = paymentMode;
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.date = date;
		this.cvv = cvv;
		this.user = user;
	}



	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(Long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public long getCvv() {
		return cvv;
	}

	public void setCvv(long cvv) {
		this.cvv = cvv;
	}



	public UserRegistration getUser() {
		return user;
	}



	public void setUser(UserRegistration user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "PaymentModel [paymentId=" + paymentId + ", totalPrice=" + totalPrice + ", paymentMode=" + paymentMode
				+ ", cardHolderName=" + cardHolderName + ", cardNumber=" + cardNumber + ", date=" + date + ", cvv="
				+ cvv + ", user=" + user + "]";
	}
	
	 
}

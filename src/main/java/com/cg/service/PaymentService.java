package com.cg.service;

import java.util.List;

import com.cg.model.PaymentModel;

public interface PaymentService {

	  public PaymentModel addPaymentDetails(PaymentModel entity);
	  
	  public List<PaymentModel> getAllPayments();
	  
	  public void deletePaymentDetails(PaymentModel data);
}

package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.model.PaymentModel;
import com.cg.repository.PaymentRepo;

@Service
public class PaymentServiceImp {
	
	 @Autowired
	 public PaymentRepo repo;
    
	 
	 public PaymentModel addPaymentDetails(PaymentModel entity){
	 
	 return repo.save(entity);
	 
	 }
	 
	 
	 public List<PaymentModel> getAllPayments(){
		 return repo.findAll();
	 }
	 
	 
	 public  void deletePaymentDetails(PaymentModel data) {
		 repo.delete(data);
	 }
	 
	 public Optional<PaymentModel> getPaymentById(Long Id) {
			
			return repo.findById(Id);
	 }

	 public List<PaymentModel> findByCardHolderName(String cardHolderName){
		 return repo.findByCardHolderName(cardHolderName);
	 }
}

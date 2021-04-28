package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.PaymentModel;
import com.cg.exception.PaymentNotFoundException;
import com.cg.service.PaymentServiceImp;


import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(origins= "http://localhost:3000")
@RestController
@Slf4j
public class PaymentController {
	
	@Autowired
	 public  PaymentServiceImp service;
	 
    
   final Logger log=(Logger) org.slf4j.LoggerFactory.getLogger(PaymentModel.class);
   
   @PostMapping("/user/pay")
   public PaymentModel createPayment(@RequestBody PaymentModel data) {
	   log.info("saves payment details"+data.toString());
	   return service.addPaymentDetails(data);
   }
   
   @GetMapping("/user/pay")
   public List<PaymentModel> allPayments(){
	   log.info("Display all users list");
	   return service.getAllPayments();
   }
   @DeleteMapping("/user/pay/{id}")
   public String deletePayment(@PathVariable(value="id") long redId) throws PaymentNotFoundException {
	   
	   PaymentModel user = service.getPaymentById(redId).orElseThrow(()-> new PaymentNotFoundException("Payment Not Found"));
	   service.deletePaymentDetails(user);
	   log.info("Delete the payment details");
	   return "Details Deleted!!!";
   }
   
   @GetMapping("/user/payy/{name}")
   public List<PaymentModel> findByName(@PathVariable(value="name") String uname){
	   log.info("Dispaly the user details by name");
	   return service.findByCardHolderName(uname);
   }
}

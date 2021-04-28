package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.model.PaymentModel;


@Repository
public interface PaymentRepo extends JpaRepository<PaymentModel,Long>{
	
	public List<PaymentModel> findByCardHolderName(String cardHolderName);

}

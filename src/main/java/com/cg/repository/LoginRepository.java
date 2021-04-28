package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.model.Login;

public interface LoginRepository extends JpaRepository<Login,Long>{
	

	public List<Login> findByUsername(String username);


}

package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public Customer findByEmailAndPass(String email, String password);

	public Customer findByEmail(String temp);
	
}
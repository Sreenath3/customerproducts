package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public Customer findByEmailAndPassAndOrderid(String email, String password,Integer orderid);

	public Customer findByEmail(String temp);
	public Customer findByOrderid(int orderid);
	
}

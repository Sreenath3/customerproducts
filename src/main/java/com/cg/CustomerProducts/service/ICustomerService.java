package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Customer;

public interface ICustomerService {

	public List<Customer> findAll();

	public void save(Customer customer);

	public Customer findById(Integer id);

	public Customer findByIdAndEmailAndPassAndOrderid(Integer id,String email, String password,Integer orderid);
	public Customer findByIdAndEmailAndPass(Integer id,String email, String password);

	public Customer findByEmail(String email);
	public Customer findByOrderid(Integer orderid);

	
	

	


}

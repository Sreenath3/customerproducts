package com.cg.CustomerProducts.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerProducts.dao.CustomerDao;
import com.cg.CustomerProducts.model.Customer;

@Service("service")
public class CustomerServiceImpl implements ICustomerService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private CustomerDao customerdao;


	

	
	@Override
	public List<Customer> findAll() {
		List<Customer> customerlist = customerdao.findAll();
		return customerlist;
	}

	@Override
	public void save(Customer customer) {
		customerdao.save(customer);

	}

	@Override
	public Customer findById(Integer id) {
		Customer customer = customerdao.findById(id).get();
		return customer;
	}

	@Override
	public Customer findByIdAndEmailAndPassAndOrderid(Integer id,String email, String password,Integer orderid) {
		try {
			Customer customer = customerdao.findByIdAndEmailAndPassAndOrderid(id,email, password,orderid);
			return customer;
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public Customer findByEmail(String email) {
		Customer customer = customerdao.findByEmail(email);
		return customer;
	}

	@Override
	public Customer findByOrderid(Integer orderid) {
		Customer customer = customerdao.findByOrderid(orderid);
		return customer;
	}

	@Override
	public Customer findByIdAndEmailAndPass(Integer id, String email, String password) {
		
		try {
			Customer customer = customerdao.findByIdAndEmailAndPass(id,email, password);
			return customer;
		} catch (Exception e) {
			return null;
		}
	}

	

	

}

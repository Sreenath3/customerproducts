package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Order;

public interface IOrderService {

	public void save(Order order);
	
	public List<Order> findAll();
}

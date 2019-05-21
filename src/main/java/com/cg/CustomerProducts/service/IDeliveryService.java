package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Delivery;

public interface IDeliveryService {

	public void save(Delivery delivery);
	public Delivery findById(int id);
	
	public Delivery findByProductID(int id);
	public List<Delivery> findAll();
}

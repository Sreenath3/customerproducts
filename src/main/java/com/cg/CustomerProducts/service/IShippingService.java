package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Shipping;

public interface IShippingService {

public Shipping findById(int id);
	
	public Shipping findByIdAndEmail(int id, String email);
	
	public void save(Shipping shipping);
	
	public List<Shipping> findAll();
}

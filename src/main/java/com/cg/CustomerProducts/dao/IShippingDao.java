package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Shipping;


public interface IShippingDao extends JpaRepository<Shipping, Integer> {

	public Shipping findByIdAndEmail(int id, String email);

	
}

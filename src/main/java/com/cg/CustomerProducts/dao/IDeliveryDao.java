package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Delivery;

public interface IDeliveryDao  extends JpaRepository<Delivery,Integer>{
	public Delivery findByProductID(int id);
	

}

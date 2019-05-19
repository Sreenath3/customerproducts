package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Product;

public interface IProduct extends JpaRepository<Product, String>{
	public Product findByProductidAndProductname(Integer productid,String productname);
	

}

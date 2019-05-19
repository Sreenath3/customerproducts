package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Product;

public interface IProductService {
	public List<Product> findAll();

	public void save(Product product);
	public Product findByProductidAndProductname(Integer productid,String productname);

}

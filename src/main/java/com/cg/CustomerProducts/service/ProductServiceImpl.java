package com.cg.CustomerProducts.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerProducts.dao.IProduct;
import com.cg.CustomerProducts.model.Product;
@Service("service4")
public class ProductServiceImpl implements IProductService{
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private IProduct productdao;
	@Override
	public List<Product> findAll() {
		List<Product> customerlist = productdao.findAll();
		return customerlist;
	}

	@Override
	public void save(Product product) {
		productdao.save(product);

	}

	@Override
	public Product findByProductidAndProductname(Integer productid, String productname) {
		
		try {
			Product product = productdao.findByProductidAndProductname(productid,productname);
			return product;
		} catch (Exception e) {
			return null;
		}
	}
	

}

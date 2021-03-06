package com.cg.CustomerProducts.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerProducts.dao.IShippingDao;
import com.cg.CustomerProducts.model.Shipping;

@Service("service1")
public class IShippingServiceImpl implements IShippingService {

	@Autowired
	IShippingDao dao;
	
	@Override
	public Shipping findById(int id) {
		Shipping shipping= dao.findById(id).get();
		return shipping;
	}

	@Override
	public Shipping findByIdAndEmail(int id, String email) {
		Shipping shipping = null;
		try {
			shipping = dao.findByIdAndEmail(id , email);
		} catch (Exception e) {
			shipping = null;
		}
		return shipping;
	}

	@Override
	public void save(Shipping shipping) {
		dao.save(shipping);

	}

	@Override
	public List<Shipping> findAll() {
		return dao.findAll();
	}

}


package com.cg.CustomerProducts.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerProducts.dao.MerchantDao;
import com.cg.CustomerProducts.model.Merchant;
@Service("service2")
public class MerchantServiceImpl implements IMerchantService {
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private MerchantDao merchantdao;

	@Override
	public Merchant findById(Integer id) {
		Merchant merchant = merchantdao.findById(id).get();
		return merchant;
	}

	@Override
	public List<Merchant> findAll() {
		List<Merchant> customerlist = merchantdao.findAll();
		return customerlist;
	}

	@Override
	public void save(Merchant merchant) {
		merchantdao.save(merchant);		
	}

}

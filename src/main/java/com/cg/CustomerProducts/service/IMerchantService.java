package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Merchant;

public interface IMerchantService {
	public List<Merchant> findAll();

	public void save(Merchant merchant);
	public Merchant findById(Integer id);

}

package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Merchant;

public interface MerchantDao extends JpaRepository<Merchant, Integer> {

}

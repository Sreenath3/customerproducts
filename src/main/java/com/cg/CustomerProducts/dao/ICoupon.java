package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Coupon;

public interface ICoupon extends JpaRepository<Coupon, Integer>{

}

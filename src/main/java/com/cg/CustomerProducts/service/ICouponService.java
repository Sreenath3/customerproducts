package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.Coupon;

public interface ICouponService {
	public void save(Coupon coupon);

	public List<Coupon> findAll();

}

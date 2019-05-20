package com.cg.CustomerProducts.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerProducts.dao.ICoupon;
import com.cg.CustomerProducts.model.Coupon;
import com.cg.CustomerProducts.model.Customer;

@Service("service5")
public class CouponServiceImpl implements ICouponService {
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ICoupon coupondao;
	@Override
	public List<Coupon> findAll() {
		List<Coupon> customerlist = coupondao.findAll();
		return customerlist;
	}

	@Override
	public void save(Coupon coupon) {
		coupondao.save(coupon);

	}

}

package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.Order;


public interface IOrder  extends JpaRepository<Order, Integer>{

}

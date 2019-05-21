package com.cg.CustomerProducts.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.CustomerProducts.model.AddQuery;

public interface QueryDao extends JpaRepository<AddQuery,Integer> {

}

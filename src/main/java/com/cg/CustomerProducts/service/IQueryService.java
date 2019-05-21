package com.cg.CustomerProducts.service;

import java.util.List;

import com.cg.CustomerProducts.model.AddQuery;

public interface IQueryService {
	public List<AddQuery> findAll();
	public void save(AddQuery addquery);

}

package com.cg.CustomerProducts.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CustomerProducts.dao.QueryDao;
import com.cg.CustomerProducts.model.AddQuery;
@Service("service65")
public class QueryServiceImpl implements IQueryService{
	@PersistenceContext
	private EntityManager em;

	@Autowired
	QueryDao querydao;
	public List<AddQuery> findAll()
	{
		return querydao.findAll();
	}
	@Override
	public void save(AddQuery addquery) {
		querydao.save(addquery);
		
	}

}

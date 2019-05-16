package com.cg.CustomerProducts.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Product {
  
	private int serialnumber;
	private String productname;
	private String productcategory;

	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq90_cus_id", allocationSize = 1)
	private int productid;
	private String brand;
	private int productstock;
	
}

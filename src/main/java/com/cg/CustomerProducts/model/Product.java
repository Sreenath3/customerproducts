package com.cg.CustomerProducts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "product_details")
public class Product {
  
	private int serialnumber;
	private int productPrice;
	public int getSerialnumber() {
		return serialnumber;
	}
	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getProductstock() {
		return productstock;
	}
	public void setProductstock(int productstock) {
		this.productstock = productstock;
	}
	private String productname;
	private String productcategory;

	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq90_cus_id", allocationSize = 1)
	private int productid;
	private String brand;
	private int productstock;
	@Override
	public String toString() {
		return "Product [serialnumber=" + serialnumber + ", productPrice=" + productPrice + ", productname="
				+ productname + ", productcategory=" + productcategory + ", productid=" + productid + ", brand=" + brand
				+ ", productstock=" + productstock + "]";
	}
	
}

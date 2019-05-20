package com.cg.CustomerProducts.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coupon_details")
public class Coupon {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int couponId;

	/*
	 * @OneToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name="productId") private int productId;//one to one
	 */ private String couponName;
	private String couponDiscountValue;

	public Coupon() {
		super();
	}

	public int getCouponId() {
		return couponId;
	}

	public void setCouponId(int couponId) {
		this.couponId = couponId;
	}

	/*
	 * public int getProductId() { return productId; } public void setProductId(int
	 * productId) { this.productId = productId; }
	 */
	public String getCouponName() {
		return couponName;
	}

	public void setCouponName(String couponName) {
		this.couponName = couponName;
	}

	public String getCouponDiscountValue() {
		return couponDiscountValue;
	}

	public void setCouponDiscountValue(String couponDiscountValue) {
		this.couponDiscountValue = couponDiscountValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + couponId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coupon other = (Coupon) obj;
		if (couponId != other.couponId)
			return false;
		return true;
	}

}

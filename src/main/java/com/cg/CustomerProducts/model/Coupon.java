package com.cg.CustomerProducts.model;



	import java.util.Date;

	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;

	@Entity
	public class Coupon {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int couponId;
		
		/*@OneToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="productId")
		private int productId;//one to one
	*/	private String couponName;
		private double couponDiscountValue;
		@ManyToOne
		@JoinColumn(name="merchantId")
		private Merchant merchant;
		
		
		public Merchant getMerchant() {
			return merchant;
		}
		public void setMerchant(Merchant merchant) {
			this.merchant = merchant;
		}
		public Coupon() {
			super();
		}
		
		public int getCouponId() {
			return couponId;
		}
		public void setCouponId(int couponId) {
			this.couponId = couponId;
		}
		
		/*public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}*/
		public String getCouponName() {
			return couponName;
		}
		public void setCouponName(String couponName) {
			this.couponName = couponName;
		}
		public double getCouponDiscountValue() {
			return couponDiscountValue;
		}
		public void setCouponDiscountValue(double couponDiscountValue) {
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



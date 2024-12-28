package com.bodyRevive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productid;
	
	private String productImage;
    private String productName;
    private String productPrice;
    private String productQuantity;
	public products(Long productid, String productImage, String productName, String productPrice,
			String productQuantity) {
		super();
		this.productid = productid;
		this.productImage = productImage;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	public products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	
}

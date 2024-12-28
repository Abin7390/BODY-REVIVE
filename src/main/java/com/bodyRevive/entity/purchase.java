package com.bodyRevive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class purchase {
	
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long pBookingid; // Changed data type to Long

	    private String username;
	    private String productName;
	    private String amount;
	    private String quantity;
	    private String address;
	    private String mob;
	    private String pin;
		public purchase(Long pBookingid, String username, String productName, String amount, String quantity,
				String address, String mob, String pin) {
			super();
			this.pBookingid = pBookingid;
			this.username = username;
			this.productName = productName;
			this.amount = amount;
			this.quantity = quantity;
			this.address = address;
			this.mob = mob;
			this.pin = pin;
		}
		public purchase() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getpBookingid() {
			return pBookingid;
		}
		public void setpBookingid(Long pBookingid) {
			this.pBookingid = pBookingid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getMob() {
			return mob;
		}
		public void setMob(String mob) {
			this.mob = mob;
		}
		public String getPin() {
			return pin;
		}
		public void setPin(String pin) {
			this.pin = pin;
		}
		
}

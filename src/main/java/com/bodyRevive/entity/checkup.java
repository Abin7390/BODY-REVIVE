package com.bodyRevive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class checkup {

	@Id
	String username;
	String name;
	String sugar;
	String bp;
	String age;
	String weight;
	String height;
	public checkup(String username,String name, String sugar, String bp,String age,String weight,String height) {
		super();
		this.username = username;
		this.name = name;
		this.sugar = sugar;
		this.bp = bp;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}
	public checkup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSugar() {
		return sugar;
	}
	public void setSugar(String sugar) {
		this.sugar = sugar;
	}
	public String getBp() {
		return bp;
	}
	public void setBp(String bp) {
		this.bp = bp;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	
	
	
}

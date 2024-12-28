package com.bodyRevive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class docbooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long bookingid;
	private String username;
	private String doctorid;
	private String doctorname;
	private String specialisation;
	private String email;
	private String ph_no;
	private String date;
	public docbooking(Long bookingid, String username, String doctorid, String doctorname, String specialisation,
			String email, String ph_no, String date) {
		super();
		this.bookingid = bookingid;
		this.username = username;
		this.doctorid = doctorid;
		this.doctorname = doctorname;
		this.specialisation = specialisation;
		this.email = email;
		this.ph_no = ph_no;
		this.date = date;
	}
	public docbooking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getBookingid() {
		return bookingid;
	}
	public void setBookingid(Long bookingid) {
		this.bookingid = bookingid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDoctorid() {
		return doctorid;
	}
	public void setDoctorid(String doctorid) {
		this.doctorid = doctorid;
	}
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
package com.bodyRevive.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class register {
    @Id
    
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    private String age;
    private String email;
    private String ph_no;
    
    public register(String username, String password, String first_name, String last_name, String age, String email, String ph_no) {
        super();
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.email = email;
        this.ph_no = ph_no;
    }
    
  
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getFirst_name() {
        return first_name;
    }
    
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    
    public String getLast_name() {
        return last_name;
    }
    
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    public String getAge() {
        return age;
    }
    
    public void setAge(String age) {
        this.age = age;
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
    public register() {
        super();
        // TODO Auto-generated constructor stub
    }
}

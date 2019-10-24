package com.unlearn.app.domain;

import java.util.Date;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column(name="userId")
	private int userId;
	
	@Column(name="fullName")
	private String fullName;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="hashedPassword")
	private String password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dob")
	private Date dob;
	
	@Column(name="address")
	private String address;
	
	@Column(name="userType")
	private String userType;
	
	@Column(name="preferences")
	private String preferences;
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setFullname(String name) {
		this.fullName = name;
	}
	
	public void setUsername(String username) {
		this.userName = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setUsertype(String userType) {
		this.userType = userType;
	}
	
	public String getName() {
		return fullName;
	}
	
	public String getUsername() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
}

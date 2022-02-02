package com.vehicallicense.vehicallicenseapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="User_Tb")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="User_Id")
	private int userId;
	@Column(name="Email_Id")
	@NotNull(message="Email can't be blank")
	@Email(message="Invalid email")
	private String email;
	@Column(name="Password")
	@NotNull(message="Password is mandatory")
	@Pattern(regexp="^[A-Za-z0-9@*#!]{6,}$",message="Provide appropriate password")
	private String password;
	
	public User() {
		super();
		
	}

	public User(int userId, String email, String password) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + "]";
	}
	
	
}

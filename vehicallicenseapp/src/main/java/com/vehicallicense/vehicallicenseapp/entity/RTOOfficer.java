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
import javax.validation.constraints.Size;

@Entity
@Table(name="RTO_Officer_Tb")
public class RTOOfficer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RTO_Officer_Id")
	private int rtoOfficerId;
	@Column(name="User_Name")
	@NotNull(message="User name can't be blank")
	@Size(min=2,max=20)
	private String userName;
	@Column(name="Password")
	@NotNull(message="Password can't be blank")
	@Pattern(regexp="^[A-Za-z0-9@*#!]{6,}$",message="Password should contain min 6 char")
	private String password;
	@Column(name="Email")
	@NotNull(message="Email can't be blank")
	@Email(message="Invalid email")
	private String email;
	public RTOOfficer() {
		super();
		
	}
	public RTOOfficer(int rtoOfficerId, String userName, String password, String email) {
		super();
		this.rtoOfficerId = rtoOfficerId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getRtoOfficerId() {
		return rtoOfficerId;
	}
	public void setRtoOfficerId(int rtoOfficerId) {
		this.rtoOfficerId = rtoOfficerId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "RTOOfficer [rtoOfficerId=" + rtoOfficerId + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + "]";
	}
	
}

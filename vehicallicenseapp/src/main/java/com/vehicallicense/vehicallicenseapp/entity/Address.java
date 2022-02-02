package com.vehicallicense.vehicallicenseapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Address_Tb")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Address_Id")
	private int addressId;
	@Column(name="State_Name")
	@NotNull(message="State Name should not be blank")
	private String state;
	@Column(name="City_Name")
	@NotNull(message="City Name should not be blank")
	private String city;
	@Column(name="House_Name")
	@NotNull(message="House Name should not be blank")
	private String house;
	@Column(name="LandMark")
	@NotNull(message="Landmark should not be blank")
	private String landMark;
	@Column(name="Pincode_Number")
	@NotNull(message="Pin code can't be blank")
	@Pattern(regexp="^[1-9]{1}[0-9]{5}$",message="Pincode should contain 6 number and it should not start with 0")
	private String pincode;
	
	public Address() {
		super();
		
	}

	public Address(int addressId, String state, String city, String house, String landMark, String pincode) {
		super();
		this.addressId = addressId;
		this.state = state;
		this.city = city;
		this.house = house;
		this.landMark = landMark;
		this.pincode = pincode;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(String house) {
		this.house = house;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", state=" + state + ", city=" + city + ", house=" + house
				+ ", landMark=" + landMark + ", pincode=" + pincode + "]";
	}
	
	
	
}

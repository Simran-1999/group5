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
@Table(name="Challan_Tb")
public class Challan {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Challan_Id")
	private int challanId;
	@Column(name="Challan_Number")
	@NotNull(message="Challan number can't be blank")
	private String challanNumber;
	@Column(name="Vehical_Number")
	@NotNull(message="Vehical number can't be blank")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$",message="Invalid Vehical Number")
	private String vehicalNumber;
	@Column(name="Ammount_Paid")
	private double ammountPaid;
	public Challan() {
		super();
		
	}
	public Challan(int challanId, String challanNumber, String vehicalNumber, double ammountPaid) {
		super();
		this.challanId = challanId;
		this.challanNumber = challanNumber;
		this.vehicalNumber = vehicalNumber;
		this.ammountPaid = ammountPaid;
	}
	public int getChallanId() {
		return challanId;
	}
	public void setChallanId(int challanId) {
		this.challanId = challanId;
	}
	public String getChallanNumber() {
		return challanNumber;
	}
	public void setChallanNumber(String challanNumber) {
		this.challanNumber = challanNumber;
	}
	public String getVehicalNumber() {
		return vehicalNumber;
	}
	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}
	public double getAmmountPaid() {
		return ammountPaid;
	}
	public void setAmmountPaid(double ammountPaid) {
		this.ammountPaid = ammountPaid;
	}
	@Override
	public String toString() {
		return "Challan [challanId=" + challanId + ", challanNumber=" + challanNumber + ", vehicalNumber="
				+ vehicalNumber + ", ammountPaid=" + ammountPaid + "]";
	}
	
}

package com.vehicallicense.vehicallicenseapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="RTO_Office_Tb")
public class RTOOffice {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="RTO_Id")
	private int rtoId;
	@Column(name="RTO_Name")
	@NotNull(message="RTO Name can't be blank")
	private String rtoName;
	
	public RTOOffice() {
		super();
	
	}
	public RTOOffice(int rtoId, String rtoName) {
		super();
		this.rtoId = rtoId;
		this.rtoName = rtoName;
	}
	public int getRtoId() {
		return rtoId;
	}
	public void setRtoId(int rtoId) {
		this.rtoId = rtoId;
	}
	public String getRtoName() {
		return rtoName;
	}
	public void setRtoName(String rtoName) {
		this.rtoName = rtoName;
	}
	@Override
	public String toString() {
		return "RTOOffice [rtoId=" + rtoId + ", rtoName=" + rtoName + "]";
	}
	
	
}

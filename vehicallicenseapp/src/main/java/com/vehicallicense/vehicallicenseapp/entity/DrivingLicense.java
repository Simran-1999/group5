package com.vehicallicense.vehicallicenseapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Driving_License_Tb")
public class DrivingLicense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Driving_License_Id")
	private int drivingLicenseId;
	@Column(name="Driving_License_number")
	@NotNull(message="Driving license number can't be blank")
	@Pattern(regexp="^[a-zA-Z]{2}-\\d\\d-(19\\d\\d|20[01][0-9])-\\d{7}$",message="Invalid driving license number")
	private String drivingLicenseNumber;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Date_Of_Issue")
	private Date dateOfissue;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Date_Of_Expiry")
	private Date validTill;
	
	public DrivingLicense() {
		super();
	
	}

	public DrivingLicense(int drivingLicenseId, String drivingLicenseNumber, Date dateOfissue, Date validTill) {
		super();
		this.drivingLicenseId = drivingLicenseId;
		this.drivingLicenseNumber = drivingLicenseNumber;
		this.dateOfissue = dateOfissue;
		this.validTill = validTill;
	}

	public int getDrivingLicenseId() {
		return drivingLicenseId;
	}

	public void setDrivingLicenseId(int drivingLicenseId) {
		this.drivingLicenseId = drivingLicenseId;
	}

	public String getDrivingLicenseNumber() {
		return drivingLicenseNumber;
	}

	public void setDrivingLicenseNumber(String drivingLicenseNumber) {
		this.drivingLicenseNumber = drivingLicenseNumber;
	}

	public Date getDateOfissue() {
		return dateOfissue;
	}

	public void setDateOfissue(Date dateOfissue) {
		this.dateOfissue = dateOfissue;
	}

	public Date getValidTill() {
		return validTill;
	}

	public void setValidTill(Date validTill) {
		this.validTill = validTill;
	}

	@Override
	public String toString() {
		return "DrivingLicense [drivingLicenseId=" + drivingLicenseId + ", drivingLicenseNumber=" + drivingLicenseNumber
				+ ", dateOfissue=" + dateOfissue + ", validTill=" + validTill + "]";
	}
	
}

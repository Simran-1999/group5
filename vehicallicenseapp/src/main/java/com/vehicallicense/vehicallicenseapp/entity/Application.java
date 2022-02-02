package com.vehicallicense.vehicallicenseapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Application_Tb")
public class Application {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Application_Id")
	private int applicationId;
	@Enumerated(value=EnumType.STRING)
	private ApplicationType applicationType;
	@Column(name="Application_Nmuber")
	@NotNull(message="Application Number can't be blank")
	private String applicationNumber;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Application_Date")
	private Date applicationDate;
	@Column(name="Mode_Of_Payment")
	@NotNull(message="Mode of payment can't be blank")
	private String modeOfPayment;
	@Column(name="Ammount_paid")
	@NotNull(message="Amount paid can't be blank")
	private double ammountPaid;
	@Column(name="Payment_Status")
	@NotNull(message="Payment status can't be blank")
	private String paymentStatus;
	@Enumerated(value=EnumType.STRING)
	private ApplicationStatus applicationStatus;
	@Column(name="Remark")
	private String remark;
	
	public Application() {
		super();
		
	}

	public Application(int applicationId, String applicationNumber, Date applicationDate, String modeOfPayment,
			double ammountPaid, String paymentStatus, String remark,ApplicationStatus applicationStatus,ApplicationType applicationType) {
		super();
		
		this.applicationId = applicationId;
		this.applicationType = applicationType;
		this.applicationNumber = applicationNumber;
		this.applicationDate = applicationDate;
		this.modeOfPayment = modeOfPayment;
		this.ammountPaid = ammountPaid;
		this.paymentStatus = paymentStatus;
		this.remark = remark;
		this.applicationStatus=applicationStatus;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public ApplicationType getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(ApplicationType applicationType) {
		this.applicationType = applicationType;
	}

	public String getApplicationNumber() {
		return applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public Date getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(Date applicationDate) {
		this.applicationDate = applicationDate;
	}

	public String getModeOfPayment() {
		return modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}

	public double getAmmountPaid() {
		return ammountPaid;
	}

	public void setAmmountPaid(double ammountPaid) {
		this.ammountPaid = ammountPaid;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	@Override
	public String toString() {
		return "Application [applicationId=" + applicationId + ", applicationType=" + applicationType
				+ ", applicationNumber=" + applicationNumber + ", applicationDate=" + applicationDate
				+ ", modeOfPayment=" + modeOfPayment + ", ammountPaid=" + ammountPaid + ", paymentStatus="
				+ paymentStatus + ", applicationStatus=" + applicationStatus + ", remark=" + remark + "]";
	}



	
	
}

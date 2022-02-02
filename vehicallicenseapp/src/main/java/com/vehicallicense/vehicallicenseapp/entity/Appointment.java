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
@Table(name="Appointment_Tb")
public class Appointment {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Appointment_Id")
	private int appointmentId;
	@Column(name="Appointment_Number")
	@NotNull(message="Appointment number can't be blank")
	private String appointmentNumber;
	@Temporal(value=TemporalType.DATE)
	@Column(name="Test_Date")
	private Date testDate;
	@Column(name="Time_Slot")
	@NotNull(message="This field is mandatory")
	@Pattern(regexp="^[0-9]{1,2}[A,M,P]{2}-[0-9]{1,2}[A,M,P]{2}$",message="Please provide apropriate time slot")
	private String timeSlot;
	@Column(name="Test_Result")
	@NotNull(message="Result can't be blank")
	private String testResult;
	
	public Appointment() {
		super();
	}

	public Appointment(int appointmentId, String appointmentNumber, Date testDate, String timeSlot, String testResult) {
		super();
		this.appointmentId = appointmentId;
		this.appointmentNumber = appointmentNumber;
		this.testDate = testDate;
		this.timeSlot = timeSlot;
		this.testResult = testResult;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAppointmentNumber() {
		return appointmentNumber;
	}

	public void setAppointmentNumber(String appointmentNumber) {
		this.appointmentNumber = appointmentNumber;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	@Override
	public String toString() {
		return "Appointment [appointmentId=" + appointmentId + ", appointmentNumber=" + appointmentNumber
				+ ", testDate=" + testDate + ", timeSlot=" + timeSlot + ", testResult=" + testResult + "]";
	}
	
}

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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity 
@Table(name="Applicant_Tb")
public class Applicant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Applicant_Id")
	private int applicantId;
	@Enumerated(value=EnumType.STRING)
	private Gender gender;
	@Column(name="First_Name")
	@NotNull(message="First Name should not be blank")
	private String firstName;
	@Column(name="Middle_Name")
	@NotNull(message="Middle Name should not be blank")
	private String middleName;
	@Column(name="Last_Name")
	@NotNull(message="Last Name should not be blank")
	private String lastName;
	@Temporal(value=TemporalType.DATE)
	@Column(name="DOB")
	private Date dateOfBirth;
	@Column(name="Place_Of_Birth")
	@NotNull(message="Place Of Birth can't be blank")
	private String placeOfBirth;
	@Column(name="Qualification")
	@NotNull(message="Qualification can't be blank")
	@Size(min=2,max=10,message="Size should be greater than 2 character and less than 10 character")
	private String qualification;
	@Column(name="Mobile_Number")
	@NotNull(message="Mobile number can't be blank")
	@Pattern(regexp= "^[6-9]{1}[0-9]{9}$",message="Mobile number only contain 10 digit")
	private String mobile;
	@Column(name="Email")
	@NotNull(message="This field is mandatory")
	@Email(message="Enter valid Email")
	private String email;
	@Column(name="Nationality")
	@NotNull(message="Nationality can't be blank")
	private String nationality;
	@Column(name="Vehical_Type")
	@NotNull(message="Vehical type can't be blank")
	private String vehicalType;
	@Column(name="Vehical_Number")
	@NotNull(message="Vehical number can't be blank")
	@Pattern(regexp="^[A-Z]{2}[0-9]{2}[A-Z]{1,2}[0-9]{4}$",message="Enter valid vehical number")
	private String vehicalNumber;
	
	public Applicant() {
		super();
		
	}

	public Applicant(int applicantId, String firstName, String middleName, String lastName, Date dateOfBirth,
			String placeOfBirth, String qualification, String mobile, String email, String nationality,
			String vehicalType, String vehicalNumber,Gender gender) {
		super();
		this.applicantId = applicantId;
		this.gender=gender;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.placeOfBirth = placeOfBirth;
		this.qualification = qualification;
		this.mobile = mobile;
		this.email = email;
		this.nationality = nationality;
		this.vehicalType = vehicalType;
		this.vehicalNumber = vehicalNumber;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(String vehicalType) {
		this.vehicalType = vehicalType;
	}

	public String getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(String vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", gender=" + gender + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", placeOfBirth=" + placeOfBirth + ", qualification=" + qualification + ", mobile=" + mobile
				+ ", email=" + email + ", nationality=" + nationality + ", vehicalType=" + vehicalType
				+ ", vehicalNumber=" + vehicalNumber + "]";
	}

}

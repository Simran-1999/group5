package com.vehicallicense.vehicallicenseapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Documents_Tb")
public class Documents {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Documents_Id")
	private int documentsId;
	@Column(name="Photo")
	@NotNull(message="This field is mandatory")
	private String photo;
	@Column(name="ID_Proof")
	@NotNull(message="This field is mandatory")
	private String idProof;
	@Column(name="Address_Proof")
	@NotNull(message="This field is mandatory")
	private String addressProof;
	
	public Documents() {
		super();
	}

	public Documents(int documentsId, String photo, String idProof, String addressProof) {
		super();
		this.documentsId = documentsId;
		this.photo = photo;
		this.idProof = idProof;
		this.addressProof = addressProof;
	}

	public int getDocumentsId() {
		return documentsId;
	}

	public void setDocumentsId(int documentsId) {
		this.documentsId = documentsId;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getIdProof() {
		return idProof;
	}

	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	public String getAddressProof() {
		return addressProof;
	}

	public void setAddressProof(String addressProof) {
		this.addressProof = addressProof;
	}

	@Override
	public String toString() {
		return "Documents [documentsId=" + documentsId + ", photo=" + photo + ", idProof=" + idProof + ", addressProof="
				+ addressProof + "]";
	}
	
	
}

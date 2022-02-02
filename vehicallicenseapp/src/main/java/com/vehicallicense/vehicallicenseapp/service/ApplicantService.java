package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.Applicant;
import com.vehicallicense.vehicallicenseapp.repository.ApplicantRepo;

@Service
public class ApplicantService {

	@Autowired
	ApplicantRepo applicantRepo;
	
	public Applicant creatApplicant(Applicant applicant) {
		
		return applicantRepo.save(applicant);
	}


	public Applicant getApplicantById(int applicantId) {
		
		Optional<Applicant> applicantContainer=applicantRepo.findById(applicantId);
		
		if(applicantContainer.isPresent()) {
			
			return applicantContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteApplicantById(int applicantId) {
		Optional<Applicant> applicantContainer=applicantRepo.findById(applicantId);
		if(applicantContainer.isPresent()) {
			Applicant oldObj=applicantContainer.get();
			applicantRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+applicantId;
		}
}

	public Applicant updateApplicant(int applicantId, Applicant obj) {
		
		Optional<Applicant> applicantContainer=applicantRepo.findById(applicantId);
		if(applicantContainer.isPresent()) {
			Applicant oldObj=applicantContainer.get();
			
			oldObj.setGender(obj.getGender());
			oldObj.setFirstName(obj.getFirstName());
			oldObj.setMiddleName(obj.getMiddleName());
			oldObj.setLastName(obj.getLastName());
			oldObj.setDateOfBirth(obj.getDateOfBirth());
			oldObj.setPlaceOfBirth(obj.getPlaceOfBirth());
			oldObj.setQualification(obj.getQualification());
			oldObj.setPlaceOfBirth(obj.getPlaceOfBirth());
			oldObj.setMobile(obj.getMobile());
			oldObj.setEmail(obj.getEmail());
			oldObj.setNationality(obj.getNationality());
			oldObj.setVehicalType(obj.getVehicalType());
			oldObj.setVehicalNumber(obj.getVehicalNumber());
			
			System.out.println("Successfully Updated!!");
			return applicantRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return applicantRepo.save(obj);
		}
	}


	

}
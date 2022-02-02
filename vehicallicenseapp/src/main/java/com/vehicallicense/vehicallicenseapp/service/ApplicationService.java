package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.Application;
import com.vehicallicense.vehicallicenseapp.repository.ApplicationRepo;

@Service
public class ApplicationService {

	@Autowired
	ApplicationRepo applicationRepo;
	
	public Application creatApplication(Application application) {
		
		return applicationRepo.save(application);
	}


	public Application getApplicationById(int applicationId) {
		
		Optional<Application> applicationContainer=applicationRepo.findById(applicationId);
		
		if(applicationContainer.isPresent()) {
			
			return applicationContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteApplicationById(int applicationId) {
		Optional<Application> applicationContainer=applicationRepo.findById(applicationId);
		if(applicationContainer.isPresent()) {
			Application oldObj=applicationContainer.get();
			applicationRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+applicationId;
		}
}

	public Application updateApplication(int applicationId, Application obj) {
		
		Optional<Application> applicationContainer=applicationRepo.findById(applicationId);
		if(applicationContainer.isPresent()) {
			Application oldObj=applicationContainer.get();
			
			oldObj.setApplicationType(obj.getApplicationType());
			oldObj.setApplicationNumber(obj.getApplicationNumber());
			oldObj.setApplicationDate(obj.getApplicationDate());
			oldObj.setModeOfPayment(obj.getModeOfPayment());
			oldObj.setAmmountPaid(obj.getAmmountPaid());
			oldObj.setPaymentStatus(obj.getPaymentStatus());
			oldObj.setRemark(obj.getRemark());
			oldObj.setApplicationStatus(obj.getApplicationStatus());
		
			System.out.println("Successfully Updated!!");
			return applicationRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return applicationRepo.save(obj);
		}
	}


	

}
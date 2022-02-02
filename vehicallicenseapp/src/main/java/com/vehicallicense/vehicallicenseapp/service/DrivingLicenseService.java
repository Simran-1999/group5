package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.DrivingLicense;
import com.vehicallicense.vehicallicenseapp.repository.DrivingLicenseRepo;

@Service
public class DrivingLicenseService {

	@Autowired
	DrivingLicenseRepo drivingLicenseRepo;
	
	public DrivingLicense creatDrivingLicense(DrivingLicense drivingLicense) {
		
		return drivingLicenseRepo.save(drivingLicense);
	}


	public DrivingLicense getDrivingLicenseById(int drivingLicenseId) {
		
		Optional<DrivingLicense> drivingLicenseContainer=drivingLicenseRepo.findById(drivingLicenseId);
		
		if(drivingLicenseContainer.isPresent()) {
			
			return drivingLicenseContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteDrivingLicenseById(int drivingLicenseId) {
		Optional<DrivingLicense> drivingLicenseContainer=drivingLicenseRepo.findById(drivingLicenseId);
		
		if(drivingLicenseContainer.isPresent()) {
			DrivingLicense oldObj=drivingLicenseContainer.get();
			
			drivingLicenseRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+drivingLicenseId;
		}
}

	public DrivingLicense updateDrivingLicense(int drivingLicenseId, DrivingLicense obj) {
		
		Optional<DrivingLicense> drivingLicenseContainer=drivingLicenseRepo.findById(drivingLicenseId);
		if(drivingLicenseContainer.isPresent()) {
			DrivingLicense oldObj=drivingLicenseContainer.get();
			
			oldObj.setDrivingLicenseNumber(obj.getDrivingLicenseNumber());
			oldObj.setDateOfissue(obj.getDateOfissue());
			oldObj.setValidTill(obj.getValidTill());
			
			
			System.out.println("Successfully Updated!!");
			return drivingLicenseRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return drivingLicenseRepo.save(obj);
		}
	}


	

}
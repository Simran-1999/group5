package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.RTOOffice;
import com.vehicallicense.vehicallicenseapp.repository.RTOOfficeRepo;

@Service
public class RTOOfficeService {

	@Autowired
	RTOOfficeRepo rtoOfficeRepo;
	
	public RTOOffice creatRTOOffice(RTOOffice rtoOffice) {
		
		return rtoOfficeRepo.save(rtoOffice);
	}


	public RTOOffice getRTOOfficeById(int rtoId) {
		
		Optional<RTOOffice> rtoOfficeContainer=rtoOfficeRepo.findById(rtoId);
		
		if(rtoOfficeContainer.isPresent()) {
			
			return rtoOfficeContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteRTOOfficeById(int rtoId) {
		Optional<RTOOffice> rtoOfficeContainer=rtoOfficeRepo.findById(rtoId);
		
		if(rtoOfficeContainer.isPresent()) {
			RTOOffice oldObj=rtoOfficeContainer.get();
			
			rtoOfficeRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+rtoId;
		}
}

	public RTOOffice updateRTOOffice(int rtoId, RTOOffice obj) {
		
		Optional<RTOOffice> rtoOfficeContainer=rtoOfficeRepo.findById(rtoId);
		if(rtoOfficeContainer.isPresent()) {
			RTOOffice oldObj=rtoOfficeContainer.get();
			
			oldObj.setRtoName(obj.getRtoName());
		
			
			System.out.println("Successfully Updated!!");
			return rtoOfficeRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return rtoOfficeRepo.save(obj);
		}
	}


	

}
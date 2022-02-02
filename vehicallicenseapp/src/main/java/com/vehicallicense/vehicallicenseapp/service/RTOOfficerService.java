package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.RTOOfficer;
import com.vehicallicense.vehicallicenseapp.repository.RTOOfficerRepo;

@Service
public class RTOOfficerService {

	@Autowired
	RTOOfficerRepo rtoOfficerRepo;
	
	public RTOOfficer creatRTOOfficer(RTOOfficer rtoOfficer) {
		
		return rtoOfficerRepo.save(rtoOfficer);
	}


	public RTOOfficer getRTOOfficerById(int rtoOfficerId) {
		
		Optional<RTOOfficer> rtoOfficerContainer=rtoOfficerRepo.findById(rtoOfficerId);
		
		if(rtoOfficerContainer.isPresent()) {
			
			return rtoOfficerContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteRTOOfficerById(int rtoOfficerId) {
		Optional<RTOOfficer> rtoOfficerContainer=rtoOfficerRepo.findById(rtoOfficerId);
		
		if(rtoOfficerContainer.isPresent()) {
			RTOOfficer oldObj=rtoOfficerContainer.get();
			
			rtoOfficerRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+rtoOfficerId;
		}
}

	public RTOOfficer updateRTOOfficer(int rtoOfficerId, RTOOfficer obj) {
		
		Optional<RTOOfficer> rtoOfficerContainer=rtoOfficerRepo.findById(rtoOfficerId);
		if(rtoOfficerContainer.isPresent()) {
			RTOOfficer oldObj=rtoOfficerContainer.get();
			
			oldObj.setUserName(obj.getUserName());
			oldObj.setPassword(obj.getPassword());
			oldObj.setEmail(obj.getEmail());
			
			System.out.println("Successfully Updated!!");
			return rtoOfficerRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return rtoOfficerRepo.save(obj);
		}
	}


	

}
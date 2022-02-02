package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.Challan;
import com.vehicallicense.vehicallicenseapp.repository.ChallanRepo;

@Service
public class ChallanService {

	@Autowired
	ChallanRepo challanRepo;
	
	public Challan creatChallan(Challan challan) {
		
		return challanRepo.save(challan);
	}


	public Challan getChallanById(int challanId) {
		
		Optional<Challan> challanContainer=challanRepo.findById(challanId);
		
		if(challanContainer.isPresent()) {
			
			return challanContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteChallanById(int challanId) {
		Optional<Challan> challanContainer=challanRepo.findById(challanId);
		if(challanContainer.isPresent()) {
			Challan oldObj=challanContainer.get();
			challanRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+challanId;
		}
}

	public Challan updateChallan(int challanId, Challan obj) {
		
		Optional<Challan> challanContainer=challanRepo.findById(challanId);
		if(challanContainer.isPresent()) {
			Challan oldObj=challanContainer.get();
			
			oldObj.setChallanNumber(obj.getChallanNumber());
			oldObj.setVehicalNumber(obj.getVehicalNumber());
			oldObj.setAmmountPaid(obj.getAmmountPaid());
		
			System.out.println("Successfully Updated!!1");
			return challanRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return challanRepo.save(obj);
		}
	}



}

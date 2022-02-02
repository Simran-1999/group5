package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.Documents;
import com.vehicallicense.vehicallicenseapp.repository.DocumentsRepo;

@Service
public class DocumentsService {

	@Autowired
	DocumentsRepo documentsRepo;
	
	public Documents creatDocuments(Documents documents) {
		
		return documentsRepo.save(documents);
	}


	public Documents getDocumentsById(int documentsId) {
		
		Optional<Documents> documentsContainer=documentsRepo.findById(documentsId);
		
		if(documentsContainer.isPresent()) {
			
			return documentsContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteDocumentsById(int documentsId) {
		Optional<Documents> documentsContainer=documentsRepo.findById(documentsId);
		
		if(documentsContainer.isPresent()) {
			Documents oldObj=documentsContainer.get();
			
			documentsRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+documentsId;
		}
}

	public Documents updateDocuments(int documentsId, Documents obj) {
		
		Optional<Documents> documentsContainer=documentsRepo.findById(documentsId);
		if(documentsContainer.isPresent()) {
			Documents oldObj=documentsContainer.get();
			
			oldObj.setPhoto(obj.getPhoto());
			oldObj.setIdProof(obj.getIdProof());
			oldObj.setAddressProof(obj.getAddressProof());
			
			
			System.out.println("Successfully Updated!!");
			return documentsRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return documentsRepo.save(obj);
		}
	}


	

}
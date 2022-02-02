package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.Address;
import com.vehicallicense.vehicallicenseapp.repository.AddressRepo;

@Service
public class AddressService {

	@Autowired
	AddressRepo addressRepo;
	
	public Address creatAddress(Address address) {
		
		return addressRepo.save(address);
	}


	public Address getAddressById(int addressId) {
		
		Optional<Address> addressContainer=addressRepo.findById(addressId);
		
		if(addressContainer.isPresent()) {
			
			return addressContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteAddressById(int addressId) {
		Optional<Address> addressContainer=addressRepo.findById(addressId);
		if(addressContainer.isPresent()) {
			Address oldObj=addressContainer.get();
			addressRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+addressId;
		}
}

	public Address updateAddress(int addressId, Address obj) {
		
		Optional<Address> addressContainer=addressRepo.findById(addressId);
		if(addressContainer.isPresent()) {
			Address oldObj=addressContainer.get();
			
			oldObj.setState(obj.getState());
			oldObj.setCity(obj.getCity());
			oldObj.setHouse(obj.getHouse());
			oldObj.setLandMark(obj.getLandMark());
			oldObj.setPincode(obj.getPincode());
			
			System.out.println("Successfully Updated!!");
			return addressRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return addressRepo.save(obj);
		}
		
	}


}

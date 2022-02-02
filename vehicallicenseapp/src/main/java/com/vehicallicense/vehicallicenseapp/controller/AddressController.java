package com.vehicallicense.vehicallicenseapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicallicense.vehicallicenseapp.entity.Address;
import com.vehicallicense.vehicallicenseapp.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/addresses")
	public Address creatAddress(@Valid @RequestBody Address address)
	{
		return addressService.creatAddress(address);
	}
	
	@GetMapping("/addresses/{addressId}")
	public Address getAddressById( @PathVariable int addressId)
	{
		return addressService.getAddressById(addressId);
	}
	
	@DeleteMapping("/addresses/{addressId}")
	public String deleteAddressById( @PathVariable int addressId) {
		return addressService.deleteAddressById(addressId);
	}
	
	@PutMapping("/addresses/{addressId}")
	public Address updateAddress( @PathVariable int addressId,@Valid @RequestBody Address obj)
	{
		return addressService.updateAddress(addressId,obj);
	}


}

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

import com.vehicallicense.vehicallicenseapp.entity.DrivingLicense;
import com.vehicallicense.vehicallicenseapp.service.DrivingLicenseService;

@RestController
public class DrivingLicenseController {

	@Autowired
	DrivingLicenseService drivingLicenseService;
	
	@PostMapping("/drivingLicenses")
	public DrivingLicense creatDrivingLicense(@Valid @RequestBody DrivingLicense drivingLicense)
	{
		return drivingLicenseService.creatDrivingLicense(drivingLicense);
	}
	
	@GetMapping("/drivingLicenses/{drivingLicenseId}")
	public DrivingLicense getDrivingLicenseById( @PathVariable int drivingLicenseId)
	{
		return drivingLicenseService.getDrivingLicenseById(drivingLicenseId);
	}
	
	@DeleteMapping("/drivingLicenses/{drivingLicenseId}")
	public String deleteDrivingLicenseById( @PathVariable int drivingLicenseId) {
		return drivingLicenseService.deleteDrivingLicenseById(drivingLicenseId);
	}
	
	@PutMapping("/drivingLicenses/{drivingLicenseId}")
	public DrivingLicense updateDrivingLicense(@PathVariable int drivingLicenseId,@Valid @RequestBody DrivingLicense obj)
	{
		return drivingLicenseService.updateDrivingLicense(drivingLicenseId,obj);
	}
               
}
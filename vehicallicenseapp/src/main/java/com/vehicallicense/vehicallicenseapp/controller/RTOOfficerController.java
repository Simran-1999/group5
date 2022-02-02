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

import com.vehicallicense.vehicallicenseapp.entity.RTOOfficer;
import com.vehicallicense.vehicallicenseapp.service.RTOOfficerService;

@RestController
public class RTOOfficerController {

	@Autowired
	RTOOfficerService rtoOfficerService;
	
	@PostMapping("/rtoOfficers")
	public RTOOfficer creatRTOOfficer(@Valid @RequestBody RTOOfficer rtoOfficer)
	{
		return rtoOfficerService.creatRTOOfficer(rtoOfficer);
	}
	
	@GetMapping("/rtoOfficers/{rtoOfficerId}")
	public RTOOfficer getRTOOfficerById(@PathVariable int rtoOfficerId)
	{
		return rtoOfficerService.getRTOOfficerById(rtoOfficerId);
	}
	
	@DeleteMapping("/rtoOfficers/{rtoOfficerId}")
	public String deleteRTOOfficerById(@PathVariable int rtoOfficerId) {
		return rtoOfficerService.deleteRTOOfficerById(rtoOfficerId);
	}
	
	@PutMapping("/rtoOfficers/{rtoOfficerId}")
	public RTOOfficer updateRTOOfficer( @PathVariable int rtoOfficerId, @Valid @RequestBody RTOOfficer obj)
	{
		return rtoOfficerService.updateRTOOfficer(rtoOfficerId,obj);
	}
}
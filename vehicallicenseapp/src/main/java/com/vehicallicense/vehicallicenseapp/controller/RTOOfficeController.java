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

import com.vehicallicense.vehicallicenseapp.entity.RTOOffice;
import com.vehicallicense.vehicallicenseapp.service.RTOOfficeService;

@RestController
public class RTOOfficeController {

	@Autowired
	RTOOfficeService rtoOfficeService;
	
	@PostMapping("/rtoOffices")
	public RTOOffice creatRTOOffice(@Valid @RequestBody RTOOffice rtoOffice)
	{
		return rtoOfficeService.creatRTOOffice(rtoOffice);
	}
	
	@GetMapping("/rtoOffices/{rtoId}")
	public RTOOffice getRTOOfficeById(@PathVariable int rtoId)
	{
		return rtoOfficeService.getRTOOfficeById(rtoId);
	}
	
	@DeleteMapping("/rtoOffices/{rtoId}")
	public String deleteRTOOfficeById(@PathVariable int rtoId) {
		return rtoOfficeService.deleteRTOOfficeById(rtoId);
	}
	
	@PutMapping("/rtoOffices/{rtoId}")
	public RTOOffice updateRTOOffice(@PathVariable int rtoId,@Valid @RequestBody RTOOffice obj)
	{
		return rtoOfficeService.updateRTOOffice(rtoId,obj);
	}
}

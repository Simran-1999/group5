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
import com.vehicallicense.vehicallicenseapp.entity.Application;
import com.vehicallicense.vehicallicenseapp.service.ApplicationService;

@RestController
public class ApplicationController {

	@Autowired
	ApplicationService applicationService;
	
	@PostMapping("/applications")
	public Application creatApplication(@Valid @RequestBody Application application)
	{
		return applicationService.creatApplication(application);
	}
	
	@GetMapping("/applications/{applicationId}")
	public Application getApplicationById(@PathVariable int applicationId)
	{
		return applicationService.getApplicationById(applicationId);
	}
	
	@DeleteMapping("/applications/{applicationId}")
	public String deleteApplicationById(@PathVariable int applicationId) 
	{
		return applicationService.deleteApplicationById(applicationId);
	}
	
	@PutMapping("/applications/{applicationId}")
	public Application updateApplication(@PathVariable int applicationId,@Valid @RequestBody Application obj)
	{
		return applicationService.updateApplication(applicationId,obj);
	}
}

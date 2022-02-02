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
import com.vehicallicense.vehicallicenseapp.entity. Applicant;
import com.vehicallicense.vehicallicenseapp.service. ApplicantService;

@RestController
public class ApplicantController {

	@Autowired
	 ApplicantService  applicantService;
	
	@PostMapping("/ applicants")
	public  Applicant creatApplicant(@Valid @RequestBody  Applicant  applicant)
	{
		return applicantService.creatApplicant( applicant);
	}
	
	@GetMapping("/applicants/{applicantId}")
	public Applicant getApplicantById(@PathVariable int applicantId)
	{
		return applicantService.getApplicantById(applicantId);
	}
	
	@DeleteMapping("/applicants/{applicantId}")
	public String deleteApplicantById(@PathVariable int applicantId) {
		return applicantService.deleteApplicantById(applicantId);
	}
	
	@PutMapping("/applicants/{applicantId}")
	public Applicant updateApplicant(@PathVariable int applicantId,@Valid @RequestBody Applicant obj)
	{
		return applicantService.updateApplicant(applicantId,obj);
	}
	
}

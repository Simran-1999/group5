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

import com.vehicallicense.vehicallicenseapp.entity.Challan;
import com.vehicallicense.vehicallicenseapp.service.ChallanService;

@RestController
public class ChallanController {

	@Autowired
	ChallanService challanService;
	
	@PostMapping("/challans")
	public Challan creatChallan(@Valid @RequestBody Challan challan)
	{
		return challanService.creatChallan(challan);
	}
	
	@GetMapping("/challans/{challanId}")
	public Challan getChallanById(@PathVariable int challanId)
	{
		return challanService.getChallanById(challanId);
	}
	
	@DeleteMapping("/Challans/{challanId}")
	public String deleteChallanById( @PathVariable int challanId) {
		return challanService.deleteChallanById(challanId);
	}
	
	@PutMapping("/challans/{challanId}")
	public Challan updateChallan( @PathVariable int challanId,@Valid @RequestBody Challan obj)
	{
		return challanService.updateChallan(challanId,obj);
	}
}
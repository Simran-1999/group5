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

import com.vehicallicense.vehicallicenseapp.entity.Documents;
import com.vehicallicense.vehicallicenseapp.service.DocumentsService;

@RestController
public class DocumentsController {

	@Autowired
	DocumentsService documentsService;
	
	@PostMapping("/documents")
	public Documents creatDocuments(@Valid @RequestBody Documents documents)
	{
		return documentsService.creatDocuments(documents);
	}
	
	@GetMapping("/Documents/{documentsId}")
	public Documents getDocumentsById(@PathVariable int documentsId)
	{
		return documentsService.getDocumentsById(documentsId);
	}
	
	@DeleteMapping("/documents/{documentsId}")
	public String deleteDocumentsById(@PathVariable int documentsId) {
		return documentsService.deleteDocumentsById(documentsId);
	}
	
	@PutMapping("/documents/{documentsId}")
	public Documents updateDocuments(@PathVariable int documentsId,@Valid @RequestBody Documents obj)
	{
		return documentsService.updateDocuments(documentsId,obj);
	}
}

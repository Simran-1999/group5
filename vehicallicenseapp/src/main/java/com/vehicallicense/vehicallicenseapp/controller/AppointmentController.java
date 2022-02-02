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

import com.vehicallicense.vehicallicenseapp.entity.Appointment;
import com.vehicallicense.vehicallicenseapp.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;
	
	@PostMapping("/appointments")
	public Appointment creatAppointment(@Valid @RequestBody Appointment appointment)
	{
		return appointmentService.creatAppointment(appointment);
	}
	
	@GetMapping("/appointments/{appointmentId}")
	public Appointment getAppointmentById( @PathVariable int appointmentId)
	{
		return appointmentService.getAppointmentById(appointmentId);
	}
	
	@DeleteMapping("/appointments/{appointmentId}")
	public String deleteAppointmentById(@PathVariable int appointmentId) {
		return appointmentService.deleteAppointmentById(appointmentId);
	}
	
	@PutMapping("/appointments/{appointmentId}")
	public Appointment updateAppointment(@PathVariable int appointmentId,@Valid @RequestBody Appointment obj)
	{
		return appointmentService.updateAppointment(appointmentId,obj);
	}

}

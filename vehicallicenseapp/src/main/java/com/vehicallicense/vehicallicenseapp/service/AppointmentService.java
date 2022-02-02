package com.vehicallicense.vehicallicenseapp.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicallicense.vehicallicenseapp.entity.Appointment;
import com.vehicallicense.vehicallicenseapp.repository.AppointmentRepo;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepo appointmentRepo;
	
	public Appointment creatAppointment(Appointment appointment) {
		
		return appointmentRepo.save(appointment);
	}


	public Appointment getAppointmentById(int appointmentId) {
		
		Optional<Appointment> appointmentContainer=appointmentRepo.findById(appointmentId);
		
		if(appointmentContainer.isPresent()) {
			
			return appointmentContainer.get();
		}
		else {
			return null;
		}
		
	}

	public String deleteAppointmentById(int appointmentId) {
		Optional<Appointment> appointmentContainer=appointmentRepo.findById(appointmentId);
		if(appointmentContainer.isPresent()) {
			Appointment oldObj=appointmentContainer.get();
			appointmentRepo.delete(oldObj);
		return "Deleted Successfully";
	}
		else {
			return "The spesified id is not present:"+appointmentId;
		}
}

	public Appointment updateAppointment(int appointmentId, Appointment obj) {
		
		Optional<Appointment> appointmentContainer=appointmentRepo.findById(appointmentId);
		 
		if(appointmentContainer.isPresent()) {
			Appointment oldObj=appointmentContainer.get();
			
			oldObj.setAppointmentNumber(obj.getAppointmentNumber());
			oldObj.setTestDate(obj.getTestDate());
			oldObj.setTimeSlot(obj.getTimeSlot());
			oldObj.setTestResult(obj.getTestResult());
		
			System.out.println("Successfully Updated!!");
			return appointmentRepo.saveAndFlush(oldObj);
			
		}
		else
		{
			System.out.println("Successfully Inserted");
			return appointmentRepo.save(obj);
		}
	}


	

}
package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.Appointment;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer>{

}

package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.RTOOfficer;

@Repository
public interface RTOOfficerRepo extends JpaRepository<RTOOfficer,Integer>{

}

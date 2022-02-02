package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.DrivingLicense;

@Repository
public interface DrivingLicenseRepo extends JpaRepository<DrivingLicense,Integer>{

}

package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.RTOOffice;

@Repository
public interface RTOOfficeRepo extends JpaRepository<RTOOffice,Integer>{

}
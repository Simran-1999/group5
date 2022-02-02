package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.Application;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,Integer>{

}

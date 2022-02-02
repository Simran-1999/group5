package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.Challan;

@Repository
public interface ChallanRepo extends JpaRepository<Challan,Integer>{

}

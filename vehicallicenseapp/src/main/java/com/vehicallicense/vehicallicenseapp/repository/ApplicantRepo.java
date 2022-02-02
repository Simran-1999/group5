package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.Applicant;

@Repository
public interface ApplicantRepo extends JpaRepository<Applicant,Integer>{

}

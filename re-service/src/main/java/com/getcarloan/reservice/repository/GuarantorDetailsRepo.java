package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.GuarantorDetails;

@Repository
public interface GuarantorDetailsRepo extends JpaRepository<GuarantorDetails, Integer>{

	boolean existsByUserId(int userId);

}

package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.EnquiryDetails;

@Repository
public interface ReserviceRepo extends JpaRepository<EnquiryDetails, Integer> {

}

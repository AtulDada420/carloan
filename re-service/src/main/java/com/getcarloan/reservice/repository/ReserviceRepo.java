package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.EnquiryDetails;

import com.getcarloan.reservice.entities.User;


@Repository
public interface ReserviceRepo extends JpaRepository<EnquiryDetails, Integer> {

	boolean existsByUserId(int userId);


}

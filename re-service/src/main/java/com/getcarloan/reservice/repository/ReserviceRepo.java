package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.EnquiryDetails;
<<<<<<< HEAD
=======
import com.getcarloan.reservice.entities.User;
>>>>>>> 9bef55e1871f6cf810647c0d158aa9b009c475f4

@Repository
public interface ReserviceRepo extends JpaRepository<EnquiryDetails, Integer> {

	boolean existsByUserId(int userId);


}

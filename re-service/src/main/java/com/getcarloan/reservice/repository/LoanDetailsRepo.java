package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.LoanDetails;

@Repository
public interface LoanDetailsRepo extends JpaRepository<LoanDetails, Integer> {

<<<<<<< HEAD
=======
	boolean existsByUserId(int userId);

	String save(int userId);

>>>>>>> 3d8b7c183aa0c85c3e3db9ce9534c8536e4dbb8b
}

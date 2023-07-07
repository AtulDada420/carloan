package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}

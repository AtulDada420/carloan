package com.getcarloan.reservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.getcarloan.reservice.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}

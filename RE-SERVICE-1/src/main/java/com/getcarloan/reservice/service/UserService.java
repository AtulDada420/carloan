package com.getcarloan.reservice.service;

import java.util.List;

import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.User;

public interface UserService {

	String saveUser(User user);

	User getUserByUserId(int userId);

	List<User> getAllUsers();

	String deleteUser(int userId);
	
}

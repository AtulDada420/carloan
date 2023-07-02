package com.getcarloan.reservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.EnquiryDetails;
import com.getcarloan.reservice.entities.User;
import com.getcarloan.reservice.repository.UserRepo;
import com.getcarloan.reservice.service.UserService;

@Service
public class UserServiceIMPL implements UserService {
	@Autowired
	private UserRepo usrepo;
	@Autowired
	private JavaMailSender sender;
	
	@Override
	public String saveUser(User user) {
		usrepo.save(user);
		return "New User Added";
	}

	@Override
	public User getUserByUserId(int userId) {
		if(usrepo.existsByUserId(userId)) 
			return usrepo.findById(userId).get();
		else 
			return null;
	}

	@Override
	public List<User> getAllUsers() {
		return usrepo.findAll();
	}

	@Override
	public String deleteUser(int userId) {
		usrepo.deleteById(userId);
		return "User Details Deleted";
	}
}

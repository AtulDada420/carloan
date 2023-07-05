package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mysequen")
	@SequenceGenerator(name = "mysequen", sequenceName = "mysequence", initialValue = 101, allocationSize = 0)
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String userName;
	private String password;
	private long mobileNo;
	private String address;
	private String city;
	private String state;
	private int pincode;
}

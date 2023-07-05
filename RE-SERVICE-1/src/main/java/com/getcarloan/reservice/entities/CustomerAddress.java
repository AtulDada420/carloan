package com.getcarloan.reservice.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "custadd_generator")
	@SequenceGenerator(name = "custadd_generator", sequenceName = "CUSTOMERADDRESS_SEQUENCE",initialValue=10,allocationSize = 0)
	private int addId;
	private String areaName;
	private String cityName;
	private String district;
	private String state;
	private int pincode;
	private int houseNo;
	private String streetName;
}

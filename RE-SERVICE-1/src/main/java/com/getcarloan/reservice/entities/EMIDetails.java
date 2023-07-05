package com.getcarloan.reservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EMIDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emiID;
	private double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;


	//alldone
}
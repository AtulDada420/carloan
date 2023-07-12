package com.getcarloan.report.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamicUpdate
public class EMI {

	@Id
	private int emiID;
	private int cId;
	private double emiAmountMonthly;
	private String nextEmiDueDate;
	private String previousEmiStatus;
	
}

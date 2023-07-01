package com.getcarloan.cm.service;

import lombok.Data;

@Data
public class Cibil {
	
	private int cibilid;
	private int cibilScore;
	private String cibilScoreDateTime;
	private String status;
	private String remark;

}

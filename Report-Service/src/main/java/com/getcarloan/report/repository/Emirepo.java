package com.getcarloan.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.report.entity.EMI;

@Repository
public interface Emirepo extends JpaRepository<EMI, Integer>{

}

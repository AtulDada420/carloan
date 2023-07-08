package com.getcarloan.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.report.entity.Agreement;

@Repository
public interface Agreementrepo extends JpaRepository<Agreement, Integer>{

}

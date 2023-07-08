package com.getcarloan.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.getcarloan.report.entity.Ledger;

@Repository
public interface Ledgerrepo extends JpaRepository<Ledger, Integer> {

}

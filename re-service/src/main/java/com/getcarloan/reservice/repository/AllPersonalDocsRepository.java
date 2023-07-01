package com.getcarloan.reservice.repository;

import org.springframework.stereotype.Repository;

import com.getcarloan.reservice.entities.AllPersonalDocs;

@Repository
public interface AllPersonalDocsRepository {

	void save(AllPersonalDocs doc);

}

package com.getcarloan.reservice.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.getcarloan.reservice.entities.AllPersonalDocs;
import com.getcarloan.reservice.repository.AllPersonalDocsRepository;
import com.getcarloan.reservice.service.AllPersonalDocsService;

@Service
public class AllPersonalDocsServiceImpl implements AllPersonalDocsService{
	@Autowired
 private AllPersonalDocsRepository repo;

	@Override
	public void saveDocument(AllPersonalDocs doc) {
		
	 String id=UUID.randomUUID().toString().toUpperCase();
	 repo.save(doc);
		
	}
}

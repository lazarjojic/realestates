package com.nortal.lazar.realestate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.realestate.entity.DocumentEntity;
import com.nortal.lazar.realestate.repository.DocumentRepository;

public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentRepository documentsRepository;

	@Transactional
	@Override
	public void save(DocumentEntity documentsEntity) {
		documentsRepository.save(documentsEntity);
	}

}

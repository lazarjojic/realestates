package com.nortal.lazar.realestate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nortal.lazar.realestate.entity.DocumentEntity;

public class DocumentRepositoryImpl implements DocumentRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(DocumentEntity documentsEntity) {
		em.persist(documentsEntity);
		em.flush();
	}

}

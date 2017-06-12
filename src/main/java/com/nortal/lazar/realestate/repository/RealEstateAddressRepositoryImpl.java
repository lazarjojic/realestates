package com.nortal.lazar.realestate.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.nortal.lazar.realestate.entity.RealEstateAddressEntity;

public class RealEstateAddressRepositoryImpl implements RealEstateAddressRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(RealEstateAddressEntity realEstateAddressEntity) {
		em.persist(realEstateAddressEntity);
		em.flush();
	}

}

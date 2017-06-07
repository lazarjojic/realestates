package com.nortal.lazar.realestate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.realestate.entity.RealEstateAddressEntity;
import com.nortal.lazar.realestate.repository.RealEstateAddressRepository;

public class RealEstateAddressServiceImpl implements RealEstateAddressService {

	@Autowired
	private RealEstateAddressRepository realEstateAddressRepository;

	@Transactional
	@Override
	public void save(RealEstateAddressEntity realEstateAddressEntity) {
		realEstateAddressRepository.save(realEstateAddressEntity);
	}

}

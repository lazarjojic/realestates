package com.nortal.lazar.agency.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.repository.AgencyRepositoryImpl;

public class AgencyServiceImpl implements AgencyService {

	@Autowired
	private AgencyRepositoryImpl agencyRepository;

	@Transactional
	@Override
	public AgencyEntity save(AgencyEntity agencyEntity) {
		return agencyRepository.save(agencyEntity);
	}

	
	@Transactional
	@Override
	public List<Object[]> getAgenciesNames() {
		return agencyRepository.getAgenciesNames();
	}

	@Transactional
	@Override
	public AgencyEntity getAgency(int id) {
		return agencyRepository.getAgency(id);
	}

}

package com.nortal.lazar.agency.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.repository.AgencyRepository;

public class AgencyServiceImpl implements AgencyService {

	@Autowired
	private AgencyRepository agencyRepository;

	@Transactional
	public AgencyEntity save(AgencyEntity agencyEntity) {
		return agencyRepository.save(agencyEntity);
	}

	@Transactional
	public List<Object[]> getAgenciesNames() {
		return agencyRepository.getAgenciesNames();
	}

	@Transactional
	public AgencyEntity getAgency(int id) {
		return agencyRepository.getAgency(id);
	}

}

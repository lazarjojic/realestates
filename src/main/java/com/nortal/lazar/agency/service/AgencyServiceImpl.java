package com.nortal.lazar.agency.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.agency.entity.AgencyEntity;
import com.nortal.lazar.agency.repository.AgencyRepository;

@Service
public class AgencyServiceImpl implements AgencyService {

	@Autowired
	private AgencyRepository agencyRepository;

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

	@Transactional
	@Override
	public List<AgencyEntity> getAgencies(String name, String PIB, String director, String address, String phone) {
		return agencyRepository.getAgencies(name, PIB, director, address, phone);
	}

}

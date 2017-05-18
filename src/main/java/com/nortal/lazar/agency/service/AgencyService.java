package com.nortal.lazar.agency.service;

import java.util.List;

import com.nortal.lazar.agency.entity.AgencyEntity;

public interface AgencyService {

	public AgencyEntity save(AgencyEntity agencyEntity);

	public List<Object[]> getAgenciesNames();

	public AgencyEntity getAgency(int id);

}

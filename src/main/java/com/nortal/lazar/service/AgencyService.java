package com.nortal.lazar.service;

import java.util.List;

import com.nortal.lazar.entity.AgencyEntity;

public interface AgencyService {

	public AgencyEntity save(AgencyEntity agencyEntity);

	public List<Object[]> getAgenciesNames();

	public AgencyEntity getAgency(int id);

}

package com.nortal.lazar.agency.service;

import java.util.List;

import com.nortal.lazar.agency.entity.AgencyEntity;

public interface AgencyService {

	AgencyEntity save(AgencyEntity agencyEntity);

	List<Object[]> getAgenciesNames();

	AgencyEntity getAgency(int id);

}

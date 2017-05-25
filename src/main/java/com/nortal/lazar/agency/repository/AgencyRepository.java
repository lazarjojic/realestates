package com.nortal.lazar.agency.repository;

import java.util.List;

import com.nortal.lazar.agency.entity.AgencyEntity;

public interface AgencyRepository {

	AgencyEntity save(AgencyEntity agency);

	List<Object[]> getAgenciesNames();

	AgencyEntity getAgency(int ID);

	List<AgencyEntity> getAgencies(String name, String PIB, String director, String address, String phone);

}
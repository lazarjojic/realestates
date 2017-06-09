package com.nortal.lazar.realestate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nortal.lazar.realestate.entity.RealEstateEntity;
import com.nortal.lazar.realestate.repository.RealEstateRepository;

@Service
public class RealEstateServiceImpl implements RealEstateService {

	@Autowired
	private RealEstateRepository realEstateRepository;

	@Transactional
	@Override
	public void save(RealEstateEntity realEstateEntity) {

	}

	@Transactional
	@Override
	public RealEstateEntity getRealEstate(int ID) {
		return realEstateRepository.getRealEstate(ID);
	}

	@Transactional
	@Override
	public List<RealEstateEntity> getRealEstates(int agencyID, int userID, double price, double area, String structure, String city, String street, int number, int floor,
			String heating, boolean balcony, String type, boolean booked, String status, String variant, String description, String rooms) {
		return realEstateRepository.getRealEstates(agencyID, userID, price, area, structure, city, street, number, floor, heating, balcony, type, booked, status, variant,
				description, rooms);
	}

}

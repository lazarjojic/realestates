package com.nortal.lazar.realestate.service;

import java.util.List;

import com.nortal.lazar.realestate.entity.RealEstateEntity;

public interface RealEstateService {
	void save(RealEstateEntity realEstateEntity);

	RealEstateEntity getRealEstate(int ID);

	List<RealEstateEntity> getRealEstates(int agencyID, int userID, double price, double area, String structure, String city, String street, int number, int floor, String heating,
			boolean balcony, String type, boolean booked, String status, String variant, String description, String rooms);
}

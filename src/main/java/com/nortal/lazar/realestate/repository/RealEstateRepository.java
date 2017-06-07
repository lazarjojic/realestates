package com.nortal.lazar.realestate.repository;

import java.util.List;

import com.nortal.lazar.realestate.entity.RealEstateEntity;

public interface RealEstateRepository {

	void save(RealEstateEntity realEstateEntity);

	public RealEstateEntity getRealEstate(int ID);

	public List<RealEstateEntity> getRealEstates(int agencyID, int userID, double price, double area, String structure, String city, String street, int number, int floor,
			String heating, boolean balcony, String type, boolean booked, String status, String mode, String description, String rooms);

}

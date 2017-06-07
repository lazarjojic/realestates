package com.nortal.lazar.realestate.model;

public class RealEstateAddressModel {

	private int ID;
	private int realEstateID;
	private String city;
	private String street;
	private String number;
	private int floor;
	
	public RealEstateAddressModel() {
		
	}

	public RealEstateAddressModel(int ID, int realEstateID, String city, String street, String number, int floor) {		
		this.ID = ID;
		this.realEstateID = realEstateID;
		this.city = city;
		this.street = street;
		this.number = number;
		this.floor = floor;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getRealEstateID() {
		return realEstateID;
	}

	public void setRealEstateID(int realEstateID) {
		this.realEstateID = realEstateID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
}

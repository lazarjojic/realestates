package com.nortal.lazar.realestate.model;

public class RealEstateModel {

	private int ID;
	private int agencyID;
	private int userID;
	private double price;
	private double area;
	private String structure;
	private String heating;
	private boolean balcony;
	private String type;
	private boolean booked;
	private String status;
	private String mode;
	private String description;
	private String rooms;
	private String finance;
	private String conclusion;

	public RealEstateModel() {

	}

	public RealEstateModel(int ID, int agencyID, int userID, double price, double area, String structure, String heating, boolean balcony, String type, boolean booked,
			String status, String mode, String description, String rooms, String finance, String conclusion) {
		this.ID = ID;
		this.agencyID = agencyID;
		this.userID = userID;
		this.price = price;
		this.area = area;
		this.structure = structure;
		this.heating = heating;
		this.balcony = balcony;
		this.type = type;
		this.booked = booked;
		this.status = status;
		this.mode = mode;
		this.description = description;
		this.rooms = rooms;
		this.finance = finance;
		this.conclusion = conclusion;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getAgencyID() {
		return agencyID;
	}

	public void setAgencyID(int agencyID) {
		this.agencyID = agencyID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getHeating() {
		return heating;
	}

	public void setHeating(String heating) {
		this.heating = heating;
	}

	public boolean getBalcony() {
		return balcony;
	}

	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getBooked() {
		return booked;
	}

	public void setBooked(boolean booked) {
		this.booked = booked;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getFinance() {
		return finance;
	}

	public void setFinance(String finance) {
		this.finance = finance;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

}

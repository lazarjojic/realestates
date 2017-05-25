package com.nortal.lazar.agency.model;

/**
 * 
 * @author Lazar Model class that is representation of agency DB table
 */
public class AgencyModel {

	private int ID;
	private String name;
	private String PIB;
	private String director;
	private String address;
	private String phone;

	public AgencyModel(int ID, String name, String PIB, String director, String address, String phone) {
		this.ID = ID;
		this.name = name;
		this.PIB = PIB;
		this.director = director;
		this.address = address;
		this.phone = phone;
	}

	public AgencyModel(String name, String PIB, String director, String address, String phone) {
		this.name = name;
		this.PIB = PIB;
		this.director = director;
		this.address = address;
		this.phone = phone;
	}

	public AgencyModel() {

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPIB() {
		return PIB;
	}

	public void setPIB(String PIB) {
		this.PIB = PIB;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}

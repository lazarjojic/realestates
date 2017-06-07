package com.nortal.lazar.realestate.model;

public class PhotoModel {

	private int ID;
	private int type;
	private String path;
	private int realEstateID;

	public PhotoModel() {
		super();
	}

	public PhotoModel(int iD, int type, String path, int realEstateID) {
		super();
		ID = iD;
		this.type = type;
		this.path = path;
		this.realEstateID = realEstateID;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getRealEstateID() {
		return realEstateID;
	}

	public void setRealEstateID(int realEstateID) {
		this.realEstateID = realEstateID;
	}
	
	

}

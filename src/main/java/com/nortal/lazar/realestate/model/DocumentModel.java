package com.nortal.lazar.realestate.model;

import java.util.Date;

public class DocumentModel {

	private int ID;
	private String name;
	private String type;
	private String description;
	private Date creationDate;
	private String path;
	private int realEstateID;

	public DocumentModel() {

	}

	public DocumentModel(int ID, String name, String type, String description, Date creationDate, String path, int realEstateID) {
		this.ID = ID;
		this.name = name;
		this.type = type;
		this.description = description;
		this.creationDate = creationDate;
		this.path = path;
		this.realEstateID = realEstateID;
	}

}

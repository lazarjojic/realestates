package com.nortal.lazar.realestate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "real_estate")
public class RealEstateEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "agency_id")
	private int agencyID;

	@Column(name = "user_id")
	private int userID;

	@Column(name = "price")
	private double price;

	@Column(name = "area")
	private double area;

	@Column(name = "structure")
	private String structure;

	@Column(name = "heating")
	private String heating;

	@Column(name = "balcony", columnDefinition = "BIT", length = 1)
	private boolean balcony;

	@Column(name = "type")
	private String type;

	@Column(name = "booked", columnDefinition = "BIT", length = 1)
	private boolean booked;

	@Column(name = "status")
	private String status;

	@Column(name = "mode")
	private String mode;

	@Column(name = "description")
	private String description;

	@Column(name = "rooms")
	private String rooms;

	@Column(name = "finance")
	private String finance;

	@Column(name = "conclusion")
	private String conclusion;

	public RealEstateEntity(int id, int agencyID, int userID, double price, double area, String structure, String heating, boolean balcony, String type, boolean booked,
			String status, String mode, String description, String rooms, String finance, String conclusion) {
		this.id = id;
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

	public RealEstateEntity() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getmode() {
		return mode;
	}

	public void setmode(String mode) {
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

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
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

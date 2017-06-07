package com.nortal.lazar.realestate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "real_estate_address")
public class RealEstateAddressEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int ID;

	@Column(name = "real_estate_id")
	private int realEstateID;

	@Column(name = "city")
	private String city;

	@Column(name = "street")
	private String street;

	@Column(name = "number")
	private String number;

	@Column(name = "floor")
	private int floor;

	public RealEstateAddressEntity() {

	}

	public RealEstateAddressEntity(int ID, int realEstateID, String city, String street, String number, int floor) {
		this.ID = ID;
		this.realEstateID = realEstateID;
		this.city = city;
		this.street = street;
		this.number = number;
		this.floor = floor;
	}

}

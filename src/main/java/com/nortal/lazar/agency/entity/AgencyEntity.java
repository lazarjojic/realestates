package com.nortal.lazar.agency.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="agency")
public class AgencyEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int ID;

	@Column(name = "name")
	private String name;

	@Column(name = "pib")
	private String PIB;

	@Column(name = "director")
	private String director;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;
	
	

	public AgencyEntity() {
		
	}

	public AgencyEntity(String name, String PIB, String director, String address, String phone) {
		this.name = name;
		this.PIB = PIB;
		this.director = director;
		this.address = address;
		this.phone = phone;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
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

	public void setPib(String PIB) {
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

package com.nortal.lazar.realestate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="real_estate")
public class RealEstateEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	
	private int agency_id;
	private int user_id;
	private double price;
	private double area;
	private String structure;
	private String city;
	private String street;
	private String number;
	private int floor;
	private String heating;
	private int balcony;
	private String type;
	private int booked;
	private String status;
	private String variant;
	private String description;
	private String rooms;
	private String conclusion;
	

}

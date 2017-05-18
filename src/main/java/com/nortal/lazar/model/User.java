package com.nortal.lazar.model;

import com.nortal.lazar.user.entity.UserEntity;

public class User {
		
	private int id;	
	private String first_name;	
	private String last_name;	
	private String phone;	
	private int agency_id;
	private String agencyName;
	private String status;	
	private String username;
	private String password;
	
	public User (UserEntity userEntity) {
		this.id = userEntity.getId();
		this.first_name  = userEntity.getFirstName();
		this.last_name = userEntity.getLastName();
		this.phone = userEntity.getPhone();
		this.agency_id = userEntity.getAgency_id();
		this.status = userEntity.getStatus();
		this.username = userEntity.getUsername();
		this.password = userEntity.getPassword();
	}
	
	

	public String getAgencyName() {
		return agencyName;
	}



	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAgency_id() {
		return agency_id;
	}

	public void setAgency_id(int agency_id) {
		this.agency_id = agency_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

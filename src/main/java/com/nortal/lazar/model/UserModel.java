package com.nortal.lazar.model;

import com.nortal.lazar.user.entity.UserEntity;

/*
 * Model class based on User table and agency name as additional information
 */
public class UserModel {

	private int ID;
	private String firstName;
	private String lastName;
	private String phone;
	private int agencyID;
	private String agencyName;
	private String status;
	private String username;
	private String password;

	public UserModel(UserEntity userEntity) {
		this.ID = userEntity.getId();
		this.firstName = userEntity.getFirstName();
		this.lastName = userEntity.getLastName();
		this.phone = userEntity.getPhone();
		this.agencyID = userEntity.getAgency_id();
		this.status = userEntity.getStatus();
		this.username = userEntity.getUsername();
		this.password = userEntity.getPassword();
	}

	public UserModel() {
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAgencyID() {
		return agencyID;
	}

	public void setAgencyID(int agencyID) {
		this.agencyID = agencyID;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
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

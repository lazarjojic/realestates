package com.nortal.lazar.user.model;

import java.io.Serializable;

import com.nortal.lazar.user.entity.UserEntity;

/*
 * Model class based on User table and agency name as additional information
 */
public class UserModel implements Serializable {
	private static final long serialVersionUID = 7655488066102808080L;

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
		this.ID = userEntity.getID();
		this.firstName = userEntity.getFirstName();
		this.lastName = userEntity.getLastName();
		this.phone = userEntity.getPhone();
		this.agencyID = userEntity.getAgencyID();
		this.status = userEntity.getStatus();
		this.username = userEntity.getUsername();
		this.password = userEntity.getPassword();
	}

	public UserModel(int ID, String firstName, String lastName, String phone, int agencyID, String agencyName, String status, String username, String password) {
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.agencyID = agencyID;
		this.agencyName = agencyName;
		this.status = status;
		this.username = username;
		this.password = password;
	}

	public UserModel update(UserModel userModel) {
		this.firstName = userModel.getFirstName();
		this.lastName = userModel.getLastName();
		this.phone = userModel.getPhone();
		this.agencyID = userModel.getAgencyID();
		this.status = userModel.getStatus();
		this.username = userModel.getUsername();
		this.password = userModel.getPassword();
		return this;
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

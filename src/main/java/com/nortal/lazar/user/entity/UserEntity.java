package com.nortal.lazar.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.nortal.lazar.user.model.UserModel;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int ID;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone")
	private String phone;

	@Column(name = "agency_id")
	private int agencyID;

	@Column(name = "status")
	private String status;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	public UserEntity() {

	}

	public UserEntity(UserModel userModel) {
		// what to do with ID? do I need it?
		this.ID = userModel.getID();
		this.firstName = userModel.getFirstName();
		this.lastName = userModel.getLastName();
		this.phone = userModel.getPhone();
		this.agencyID = userModel.getAgencyID();
		this.status = userModel.getStatus();
		this.username = userModel.getUsername();
		this.password = userModel.getPassword();
	}

	public UserEntity(String firstName, String lastName, String phone, int agencyID, String status, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.agencyID = agencyID;
		this.status = status;
		this.username = username;
		this.password = password;
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

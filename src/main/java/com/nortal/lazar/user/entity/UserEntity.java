package com.nortal.lazar.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity {
	@Id
	@GeneratedValue
	private int id;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getAgency_id() {
		return agencyID;
	}

	public void setAgency_id(int agencyID) {
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

	public UserEntity(String firstName, String lastName, String phone, int agencyID, String status, String username, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.agencyID = agencyID;
		this.status = status;
		this.username = username;
		this.password = password;
	}

}

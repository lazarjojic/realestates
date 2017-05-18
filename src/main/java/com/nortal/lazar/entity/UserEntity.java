package com.nortal.lazar.entity;

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

	@Column
	private String first_name;

	@Column
	private String last_name;

	@Column
	private String phone;

	@Column
	private int agency_id;

	@Column
	private String status;

	@Column
	private String username;

	@Column
	private String password;
	
	public UserEntity () {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
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

	public UserEntity(String first_name, String last_name, String phone, int agency_id, String status, String username,
			String password) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.agency_id = agency_id;
		this.status = status;
		this.username = username;
		this.password = password;
	}

}

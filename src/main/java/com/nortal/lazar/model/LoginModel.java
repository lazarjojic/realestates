package com.nortal.lazar.model;

import javax.validation.constraints.Size;

public class LoginModel {

	@Size(min = 2, max = 20, message = "Size must be between {2} and {1}")
	private String username;

	@Size(min = 2, max = 15, message = "Size must be between {2} and {1}")
	private String password;

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

	@Override
	public String toString() {
		return "username: " + username + ", " + "password: " + password;
	}

}

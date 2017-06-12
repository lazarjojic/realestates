package com.nortal.lazar.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_image")
public class UserImageEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int ID;

	@Column(name = "user_id")
	private int userID;

	@Column(name = "image_path")
	private String imagePath;

	public UserImageEntity() {
	}

	public UserImageEntity(int userID, String imagePath) {
		this.userID = userID;
		this.imagePath = imagePath;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}

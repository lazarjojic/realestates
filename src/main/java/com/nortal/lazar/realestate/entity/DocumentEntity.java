package com.nortal.lazar.realestate.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documents")
public class DocumentEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int ID;

	@Column(name = "name")
	private String name;

	@Column(name = "type")
	private String type;

	@Column(name = "description")
	private String description;

	@Column(name = "creation_date")
	private Date creationDate;

	@Column(name = "path")
	private String path;

	@Column(name = "real_estate_id")
	private int real_estate_id;

	public DocumentEntity(int ID, String name, String type, String description, Date creationDate, String path, int real_estate_id) {
		this.ID = ID;
		this.name = name;
		this.type = type;
		this.description = description;
		this.creationDate = creationDate;
		this.path = path;
		this.real_estate_id = real_estate_id;
	}

}

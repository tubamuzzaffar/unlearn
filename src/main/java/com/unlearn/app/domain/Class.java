package com.unlearn.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Class")
public class Class implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="classId")
	private long id;

	@Column(name="businessId")
	private long businessId;
	
	@Column(name="timetableId")
	private long timetableId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="location")
	private String location;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="category")
	private String category;
	
	@Column(name="price")
	private double price;
	
	@Column(name="totalLikes")
	private int totalLikes;
	
	@Column(name="totalDislikes")
	private int totalDislikes;
}

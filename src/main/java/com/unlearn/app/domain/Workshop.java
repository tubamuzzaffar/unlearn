package com.unlearn.app.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//Class model 
@Data
@Entity
@Table(name="Workshop")
public class Workshop implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="classId")
	private long id;

	@Column(name="businessId_fk")
	private long businessId;
	
	@Column(name="className")
	private String className;
	
	@Column(name="description")
	private String description;
	
	@Column(name="media")
	private String media;
	
	@Column(name="location")
	private String location;
	
	@Column(name="capacity")
	private int capacity;
	
	@Column(name="category")
	private String category;
	
	@Column(name="price")
	private double price;
	
	@Column(name="totalLikes")
	private Integer totalLikes;
	
	@Column(name="totalDislikes")
	private Integer totalDislikes;
}

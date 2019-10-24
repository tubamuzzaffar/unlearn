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
@Table(name="Rating")
public class Rating implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="ratingId")
	private long ratingId;

	@Column(name="userId_fk")
	private long userId;
	
	@Column(name="classId_fk")
	private long classId;
	
	@Column(name="userLike")
	private Integer userLike;
	
	@Column(name="userDislike")
	private Integer userDislike;
}

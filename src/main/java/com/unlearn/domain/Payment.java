package com.unlearn.domain;

import java.io.Serializable;
import java.util.Date;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Payment")
public class Payment implements Serializable{
	
	@Id
	//@GeneratedValue
	@Column(name="paymentId")
	private Integer paymentId;
	
	@Column(name="bookingId_fk")
	private Integer bookingId;
	
	@Column(name="amount")
	private Double paymentAmount;
	
	@Column(name="paymentDate")
	private Date paymentDate;
	
	@Column(name="paymentTime")
	private String paymentTime;
	
	
	
	public Integer getPaymentId() {
		return paymentId;
	}
	
	public void setPaymentId(Integer pid) {
		this.paymentId = pid;
	}
	
	public Integer getBookingId() {
		return this.bookingId;
	}
	
	public void setBookingId(Integer bid) {
		this.bookingId = bid;
	}
	
	public Double getPaymentAmount() {
		return paymentAmount;
	}
	
	public void setPaymentAmount(Double amount) {
		this.paymentAmount = amount;
	}
	
	public Date getPaymentDate() {
		return paymentDate;
	}
	
	public void setPaymentDate(Date date) {
		this.paymentDate = date;
	}
	public String getPaymentTime() {
		return paymentTime;
	}
	
	public void setPaymentTime(String time) {
		this.paymentTime = time;
	}
	
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("PaymentId: " + paymentId + ";");
		buffer.append("Amount: " + paymentAmount + ";");
		buffer.append("Date: " + paymentDate );
		
		return buffer.toString();
	}
	
	

}

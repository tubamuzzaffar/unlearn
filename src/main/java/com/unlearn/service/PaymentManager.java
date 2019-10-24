package com.unlearn.service;

import java.io.Serializable; //to help store state
import java.util.List;

import com.unlearn.domain.*;

public interface PaymentManager extends Serializable{
	public List<Payment> getPayments();
	
	public void makePayment(Payment payment);
	
	public Payment getPaymentById(long id);
	
	public void updateProduct(Payment payment);
	
	public void deletePayment(long id);
	
	
}

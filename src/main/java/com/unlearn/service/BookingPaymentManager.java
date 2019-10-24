package com.unlearn.service;

import java.util.List;

import com.unlearn.domain.Payment;

public class BookingPaymentManager implements PaymentManager {
	private List<Payment> payments;
	
	public List<Payment> getPayments() {
		return payments;
	}

	@Override
	public void makePayment(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Payment getPaymentById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(Payment payment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePayment(long id) {
		// TODO Auto-generated method stub
		
	}
}

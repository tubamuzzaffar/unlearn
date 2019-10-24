package com.unlearn.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unlearn.domain.Payment;

@Service(value="paymentManager") // Service handles all the processing of any model. This is class is usually used by the controller
@Transactional //To handle database transactions
public class DatabasePaymentManager implements PaymentManager{
	
//	Allow you to access the database session. Autowired injects the instance of sessionFactory to DatabasePaymentManager (DI) when the class is being created at runtime
//	Session allows you to access the DB
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List<Payment> getPayments() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Payment").list();
	}

	@Override
	public void makePayment(Payment payment) {
		
		this.sessionFactory.getCurrentSession().save(payment);
		
	}

	@Override
	public Payment getPaymentById(long id) {
		Session currentSession = this.sessionFactory.getCurrentSession();
		Payment payment = (Payment) currentSession.get(Payment.class, id);
		return payment;
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

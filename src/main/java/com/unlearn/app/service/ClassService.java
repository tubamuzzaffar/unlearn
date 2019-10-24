package com.unlearn.app.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ClassService {
		
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	public List<Class> getClasses() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Class").list();
	}
	
	public Class getClassById(long id) {
		Session currentSession = this.sessionFactory.getCurrentSession();
		Class c = (Class) currentSession.get(Class.class, id);
		return c;
	}
}

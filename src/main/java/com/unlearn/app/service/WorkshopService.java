package com.unlearn.app.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.unlearn.app.domain.Class;
import com.unlearn.app.domain.Workshop;


@Service(value="workshopManager")
@Transactional
public class WorkshopService implements WorkshopManager {
		
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	@Override
	public List<Workshop> getAllWorkshops() {
		return this.sessionFactory.getCurrentSession().createQuery("FROM Workshop").list();
	}
	
	@Override
	public Workshop getWorkshopById(long id) {
		Session currentSession = this.sessionFactory.getCurrentSession(); 
		String query = "FROM Workshop WHERE classId = " + id; 
		
		List<Workshop> workshops = (List<Workshop>) currentSession.createQuery(query).list(); 
		Workshop w = workshops.get(0);
		return w;
	}

	@Override
	public List<Workshop> findClassByProperty(String query) {
		Session currentSession = this.sessionFactory.getCurrentSession(); 
		String q = "FROM Workshop w WHERE w.className LIKE :name";
		Query q1 = currentSession.createQuery(q);
		q1.setParameter("name",query);
		
		String q2 = "FROM Workshop w WHERE w.description LIKE :name";
		Query q3 = currentSession.createQuery(q2);
		q3.setParameter("name",query);
		
		String location = "FROM Workshop w WHERE w.location LIKE :name";
		Query locationq = currentSession.createQuery(location);
		locationq.setParameter("name",query);
		
		String category = "FROM Workshop w WHERE w.category LIKE :name";
		Query categoryq = currentSession.createQuery(category);
		categoryq.setParameter("name",query);
		
		List<Workshop> workshops = (List<Workshop>) q1.list(); 
		List<Workshop> workshops2 = (List<Workshop>) q3.list(); 
		List<Workshop> workshops3 = (List<Workshop>) locationq.list(); 
		List<Workshop> workshops4 = (List<Workshop>) categoryq.list(); 
		
		//description, location, category 
		
		workshops2.removeAll(workshops);
		workshops.addAll(workshops2);
		workshops2.removeAll(workshops3);
		workshops2.addAll(workshops3);
		workshops2.removeAll(workshops4);
		workshops2.addAll(workshops4);
		
		return workshops;
	}
	
	public List<Workshop> recommendations(String preference){
		Session currentSession = this.sessionFactory.getCurrentSession(); 
		System.out.println("FDJKFBDSJFBDS");
		System.out.println("FDJKFBDSJFBDS");
		System.out.println("FDJKFBDSJFBDS");
		System.out.println("FDJKFBDSJFBDS");
		
		String category = "FROM Workshop w WHERE w.category LIKE :name";
		Query categoryq = currentSession.createQuery(category);
		categoryq.setParameter("name",preference);
		
		List<Workshop> recommendationList = (List<Workshop>) categoryq.list(); 
		
		return recommendationList;
	}
}

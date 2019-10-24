package com.unlearn.app.service;

import java.io.Serializable;
import java.util.List;

import com.unlearn.app.domain.Class;
import com.unlearn.app.domain.Workshop;
import com.unlearn.app.domain.User;


public interface WorkshopManager extends Serializable{
	
	public List<Workshop> getAllWorkshops();
	
	public Workshop getWorkshopById(long id);
	
	public List<Workshop> findClassByProperty(String query);
	
	public List<Workshop> recommendations(String preference);
}

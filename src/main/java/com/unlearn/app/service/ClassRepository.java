package com.unlearn.app.service;

import java.io.Serializable;
import java.util.List;

import com.unlearn.app.domain.Class;


public interface ClassRepository extends Serializable{
	
	public List<Class> getClasses();
	
	public Class getClassById(long id);
	
	public List<Class> findClassByProperty(String input);
}

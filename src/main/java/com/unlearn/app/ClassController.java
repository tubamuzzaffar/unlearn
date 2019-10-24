package com.unlearn.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unlearn.app.service.ClassService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ClassController {
		
	@Autowired
	private ClassService classService;
	
	@RequestMapping(value = "/class/{classId}", method = RequestMethod.GET)
	public String getClass(@PathVariable long id) {
//		return classService.getClassById(id);
		return "class";
	}
	
}

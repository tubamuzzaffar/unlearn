package com.unlearn.app.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.unlearn.app.domain.Workshop;
import com.unlearn.app.domain.User;
import com.unlearn.app.service.WorkshopManager;

//@CrossOrigin(origins = "https://localhost:8080")
@RestController
public class WorkshopController {

	@Resource(name = "workshopManager")
	private WorkshopManager workshopManager;
	
	@CrossOrigin
	@RequestMapping(value = "/class", method = RequestMethod.GET)
	@ResponseBody
	public List<Workshop> getAllWorkshops() {
		return workshopManager.getAllWorkshops();
	}

	@RequestMapping(value = "/get_class/{id}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public Workshop getWorkshopById(@PathVariable long id) {
		return workshopManager.getWorkshopById(id);
	}
	
	
	@RequestMapping(value = "/search/{query}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<Workshop> findWorkshops(@PathVariable String query) {
		return workshopManager.findClassByProperty(query);
	}
	
	@RequestMapping(value = "/class/recommendations/{preferences}", method = RequestMethod.GET)
	@ResponseBody
	@CrossOrigin
	public List<Workshop> recommendations(@PathVariable String preferences) {
		/*ADD A METHOD THAT GETS ALL THE LIKES FROM THE RATINGS TABLE AND THEN THE CORRESPONDING WORKSHOPS
		 * CREATE A LIST FROM THE CATEGORIES AND USE THAT LIST TO SEARCH THE DATABASE FOR SIMILAR CLASSES
		 * Get categories of each class and store it in a list 
		 * iterate the list and add the corresponding results to the list of recommendations 
		 * Call the get rating by user ID function and then create recommended classes 
		 *  */
		
		return workshopManager.recommendations(preferences);
	}
}

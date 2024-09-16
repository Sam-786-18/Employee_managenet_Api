/**
 * 
 */
package com.employeemanagement.controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.exception.EmployeeManagementException;
import com.employeemanagement.model.Skills;
import com.employeemanagement.service.EmployeeManagementService;
@RestController
@RequestMapping("/employees")
public class EmployeeManagementController {

	@Autowired
	private EmployeeManagementService employeeManagementService;
	/**
	 * @param employeeName
	 * @return List
	 * @throws EmployeeManagementException
	 */
	@GetMapping(value = "/skills/{employeeName}")
	public List<Skills> getListOfSkillsetOfAnEmployee(@PathVariable String employeeName) throws EmployeeManagementException {
		
		return employeeManagementService.getListOfSkillSetOfEmployee(employeeName);
	}
	/**
	 * @return Hashtable
	 */
	@RequestMapping(value="/allSkills",produces=MediaType.APPLICATION_JSON_VALUE)
	public Hashtable<String, Skills> getListOfAllSkills() {
		return employeeManagementService.getListOfAllSkills();
	}

}

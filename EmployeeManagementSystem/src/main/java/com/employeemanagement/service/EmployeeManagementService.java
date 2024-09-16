/**
 * 
 */
package com.employeemanagement.service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.springframework.stereotype.Service;

import com.employeemanagement.exception.EmployeeManagementException;
import com.employeemanagement.model.Employee;
import com.employeemanagement.model.Skills;


@Service
public class EmployeeManagementService {
	
	Employee employee=new Employee();
	Skills skillA=new Skills();
	Skills skillB=new Skills();
	List<Skills> employeeskillset=new ArrayList<Skills>();
	Hashtable<String,Skills> skillsets=new Hashtable<String,Skills>();

	
	public EmployeeManagementService()
	{
	
	 skillA.setTrackName("Java");
	 skillA.setSkillName("Spring Core");
	 skillA.setProficiencyLevel("PL2");
	 
		
	 skillB.setTrackName("DotNet");
	 skillB.setSkillName("ASP .NET MVC");
	 skillB.setProficiencyLevel("PL1");
	 
	 employeeskillset.add(skillA);
	// employeeskillset.add(skillB);
	
	 
	 employee.setEmployeeId(101);
	 employee.setEmployeeName("XXX");
	 employee.setNumberOfYearsOfExperience(8);
	 employee.setSkillSets(employeeskillset);

	 

	}
	
	/**
	 * @param employeeName
	 * @return List
	 * @throws EmployeeManagementException
	 */
	public List<Skills> getListOfSkillSetOfEmployee(String employeeName)throws EmployeeManagementException {
		
		if(employeeName.equalsIgnoreCase(employee.getEmployeeName()))
		{
			if(employeeName.equalsIgnoreCase(employee.getEmployeeName()))
			{
			employeeskillset=employee.getSkillSets(); 
			}
			else
			{
				throw new EmployeeManagementException("Invalid Id");
			}
			
		}
					
		return employeeskillset; 

	}
	
	/**
	 * @return Hashtable
	 */
	public Hashtable<String,Skills> getListOfAllSkills()
	{
		skillsets.put("1", skillA);
		skillsets.put("2", skillB);
		
		return skillsets;
	}
	

}

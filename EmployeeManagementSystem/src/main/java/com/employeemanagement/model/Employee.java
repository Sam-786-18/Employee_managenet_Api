/**
 * 
 */
package com.employeemanagement.model;

import java.util.List;

/**
 * @author 448682
 *
 */
public class Employee {
	
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}
	/**
	 * @param employeeName the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	/**
	 * @return the numberOfYearsOfExperience
	 */
	public int getNumberOfYearsOfExperience() {
		return numberOfYearsOfExperience;
	}
	/**
	 * @param numberOfYearsOfExperience the numberOfYearsOfExperience to set
	 */
	public void setNumberOfYearsOfExperience(int numberOfYearsOfExperience) {
		this.numberOfYearsOfExperience = numberOfYearsOfExperience;
	}
	/**
	 * @return the skillSets
	 */
	public List<Skills> getSkillSets() {
		return skillSets;
	}
	/**
	 * @param skillSets the skillSets to set
	 */
	public void setSkillSets(List<Skills> skillSets) {
		this.skillSets = skillSets;
	}
	private int employeeId;
	private String employeeName;
	private int numberOfYearsOfExperience;
	private List<Skills> skillSets;

}

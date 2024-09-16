/**
 * 
 */
package com.employeemanagement.model;

/**
 * @author 448682
 *
 */
public class Skills {
	
	/**
	 * @return the trackName
	 */
	public String getTrackName() {
		return trackName;
	}
	/**
	 * @param trackName the trackName to set
	 */
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	/**
	 * @return the skillName
	 */
	public String getSkillName() {
		return skillName;
	}
	/**
	 * @param skillName the skillName to set
	 */
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	/**
	 * @return the proficiencyLevel
	 */
	public String getProficiencyLevel() {
		return proficiencyLevel;
	}
	/**
	 * @param proficiencyLevel the proficiencyLevel to set
	 */
	public void setProficiencyLevel(String proficiencyLevel) {
		this.proficiencyLevel = proficiencyLevel;
	}
	private String trackName;
	private String skillName;
	private String proficiencyLevel;

}

/**
 * 
 */
package com.employeemanagement.exception;

import org.springframework.stereotype.Component;


@Component
public class ExceptionResponse {
	
	private String message;
	public ExceptionResponse(String message, String details) {
		// TODO Auto-generated constructor stub
		this.message=message;
		this.description=details;
	}
	
	public ExceptionResponse() {
		// TODO Auto-generated constructor stub
		super();
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	private String description;

}

/**
 * 
 */
package com.employeemanagement.exception;

import org.springframework.stereotype.Component;



public class EmployeeManagementException extends Exception{
	
	private static final long serialVersionUID=1L;
	private String code;
	public EmployeeManagementException(String message) {
		super();
		
		this.message=message;
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeManagementException() {
		super();
		
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	private String message;
	

}

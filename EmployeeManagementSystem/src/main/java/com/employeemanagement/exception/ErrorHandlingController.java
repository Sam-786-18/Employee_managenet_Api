/**
 * 
 */
package com.employeemanagement.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandlingController {

	/**
	 * @param e
	 * @return ResponseEntity
	 */
@ExceptionHandler(EmployeeManagementException.class)
	public final ResponseEntity<ExceptionResponse> somethingWentWrong(Exception e) {
	
	ExceptionResponse errorMessage= new ExceptionResponse(e.getMessage(),
			"Please Enter a valid Employee Name");
	
		return new ResponseEntity<ExceptionResponse>(errorMessage,
				new HttpHeaders(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}

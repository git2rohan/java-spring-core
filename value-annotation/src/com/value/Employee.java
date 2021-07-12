package com.value;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value("${employee.empId}")
	String empID;
	
	@Value("${employee.empName}")
	String empName;
	
	public String getEmpID() {
		return empID;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	
	
}

package com.autowiring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.autowiring.service.Department;

public class Company {
	

	@Autowired
	@Qualifier("dept1")
	Department itDepartment;
	
	@Autowired
	@Qualifier("dept2")
	Department hrDepartment;
	
	
	public void departmentWork()
	{
		this.itDepartment.work();
		this.hrDepartment.work();
	}
	
	
}	

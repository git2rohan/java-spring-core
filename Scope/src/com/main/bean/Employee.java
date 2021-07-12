package com.main.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//If u wanna use componentScan automatic scan then u can use below annotations - 
//@Scope(scopeName = "prototype")
//@Qualifier("employee")
public class Employee {
	
	@Value("${employee.name}")
	public String employeeName;
	
	public Employee()
	{
		System.out.println("Employee object initiated..");
	}
	
	

}

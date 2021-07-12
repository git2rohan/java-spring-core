package com.advance.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("company")
public class Company {

	//Autowired annotation
	@Autowired
	Employee employee;
	
	Department department;
	
	@Autowired
	Assets desktop;
	
	@Autowired
	@Qualifier("desk")
	Assets desk;
	
	//Value annotation
	@Value("${company.name}")
	String companyName;
	@Value("${company.rating}")
	String comanyRating;
	
	void greet()
	{
		System.out.println("Greetings from company !!");
	}
	
	public Company(Department department)
	{
		this.department = department;
	}
}

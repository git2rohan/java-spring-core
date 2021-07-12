package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowiring.beans.Company;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Company company = appContext.getBean("company", Company.class);
		
		company.departmentWork();
		
	}

}

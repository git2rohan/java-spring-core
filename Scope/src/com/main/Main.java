package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.main.bean.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("Context..");
		
		//Instantiate employee bean - SingleTon ( without @Lazy )
		Employee emp = context.getBean("employee", Employee.class);
		
		//Using @Value property' - opt out employeeName
		System.out.println("Employee Name : "+ emp.employeeName);
		
		//Check if singleTon and protoType object is equal ?
		//employee - SingleTon
		//employee1 - Prototype
		if(emp == context.getBean("employee1", Employee.class))
			System.out.println("True");
		else 
			System.out.println("False");
	}
}
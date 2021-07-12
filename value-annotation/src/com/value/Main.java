package com.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Employee emp = appContext.getBean("employee", Employee.class);
		
		System.out.println(emp.getEmpID());
		
		
		
	}
}

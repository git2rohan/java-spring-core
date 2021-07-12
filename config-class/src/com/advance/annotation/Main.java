package com.advance.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Injects dependencies from beans.xml file
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		//Inject Company class object
		//Company c = context.getBean("company", Company.class);
		
		//Eliminate Beans.xml, and use ConfigClass for DI
		ApplicationContext ConfigClassContext = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Company c = ConfigClassContext.getBean("company", Company.class);
		
		//Call methods
		c.greet();
		
		//Inject through autowired
		c.employee.greet();
		
		//Inject through constructor
		c.department.greet();
		
		//injected bean - primary annotation
		c.desktop.assetName();
		
		//injected bean - qualifier name
		c.desk.assetName();
		
		//Injected values
		System.out.println(c.companyName);
		System.out.println(c.comanyRating);
		
	}

}

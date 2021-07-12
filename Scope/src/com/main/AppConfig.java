package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.main.bean.Employee;

@Configuration
@PropertySource("classpath:employee-info")
//@ComponentScan(basePackages="com.main.bean")
public class AppConfig {
	//Write methods for object creation - 
	//No component Scan
	
	@Bean
	@Lazy //It is used to instantiate bean when getBean() is used
	//@Scope(scopeName = "prototype") // Prototype type of bean
	//Default scope // SingleTon Bean
	public Employee employee()
	{
		return new Employee();
	}
	
	@Bean
	@Scope(scopeName = "prototype")
	public Employee employee1()
	{
		return new Employee();
	}
}
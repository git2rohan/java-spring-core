package com.advance.annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

//Let's scan each and every class and inject object / values
@Configurable
@ComponentScan(basePackages = "com.advance.annotation")
@PropertySource("classpath:Company-info")
public class ConfigClass {

}


//No scanning of each and every class - Inject defined bean objects
/*@Configurable
public class ConfigClass {

	@Bean
	public Company company()
	{
		return new Company(department());
	}
	
	@Bean
	public Employee employee()
	{
		return new Employee();
	}
	
	@Bean
	public Department department()
	{
		return new Department();
	}
	
	
}*/

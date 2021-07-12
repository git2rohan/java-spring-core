package com.main;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable
@PropertySource("classpath:bean1-properties")
@ComponentScan(basePackages = "com.main")
public class ConfigClass {
	
//	  @Bean 
//	  public Bean1 bean1() { 
//		  return new Bean1(); 
//	  }
//	 
//	  @Bean
//	  public Bean2 bean2()
//	  {
//		  return new Bean2();
//	  }
//	  
}

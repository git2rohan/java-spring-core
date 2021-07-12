package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		
		Bean1 bean1 = context.getBean("bean1",Bean1.class);
		
		System.out.println(bean1.name);
		System.out.println(bean1.surename);
		
		bean1.bean2.greet();
	}
}

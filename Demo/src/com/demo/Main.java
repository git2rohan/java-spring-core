package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Keys;
import com.demo.service.Engine;

public class Main {

	//Using IOC
	public static void main(String[] args) {
		
		//This is inversion of control container intialization.
		//Now my Beans.xml file will handle object creation in the app
		//My Whole module is idependent
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
		 Engine key = (Engine)applicationContext.getBean("engine");
		 new Keys().run(key);
	}

}

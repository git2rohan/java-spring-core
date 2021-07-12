package com.main;

import java.util.Timer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.main.schedular.SchedularDirect;

public class Main {

	public static void main(String[] args) {
	/*	
		//Scheduled without using annotations
		//Direct run method scheduled using TimerTask parent class
		Timer schedular = new Timer();
		schedular.schedule(new SchedularDirect(), 0, 1000);
		// 0 is 0ms delay in 1st execution
		// 1000 is 1000ms delay in each execution
	*/
		
		//@Scheduled annotation
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SchedularConfig.class);
		
		
		
	}
}

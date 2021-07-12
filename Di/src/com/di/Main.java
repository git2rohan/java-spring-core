package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.di.bean.Bike;
import com.di.bean.Car;

public class Main {

	public static void main(String[] args) {
		
		//THis is dependency injection 
		//In bike we have a dependency color and we have passed this dependency via xml file
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		//Let's instantiate bike object
		Bike bike = appContext.getBean("bike", Bike.class);
		
		System.out.println(bike.getColor());
		System.out.println(bike.getModel());
		bike.getEngineStarted();
		
		//Let's create another bike object
		//We can observe that bike constructor called only once at the time of 1st object instantiation
		Bike bike2 = appContext.getBean("bike", Bike.class);
		
		System.out.println(bike2.getColor());
		System.out.println(bike2.getModel());
		bike2.getEngineStarted();
		
		//When above code executes - We can see that bike constructor called only once and
		//it is because of singleTon Factory
	
		////Let's instantiate CAR object
		Car car = appContext.getBean("car", Car.class);
		
		System.out.println(car.getBrand());
		System.out.println(car.getCreated());
		car.getEngine().startEngine();
	}

}

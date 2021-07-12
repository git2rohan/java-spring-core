package com.di.bean;

public class Bike {
	
	//Property dependency
	public String color;
	public String model;
	
	//Object dependency
	public Engine engine;
	
	//Injecting property model and object Engine dependency by <constructor-arg> tag
	public Bike(String model, Engine engine)
	{
		System.out.println("Bike Constructor called..");
		this.model = model;
		this.engine = engine;
	}

	public String getColor() {
		return color;
	}

	//Injecting property dependency by <property> tag
	public void setColor(String color) {
		this.color = color;
	}

	public String getModel()
	{
		return this.model;
	}
	
	public void getEngineStarted()
	{
		this.engine.startEngine();
	}
	
	

}

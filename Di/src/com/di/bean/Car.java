package com.di.bean;

public class Car {
	
	String brand;
	String created;
	
	public Engine engine;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public Engine getEngine() {
		return engine;
	}

	public Car(Engine engine) {
		this.engine = engine;
		System.out.println("Car constructor called..");
	}

	
	
	

}

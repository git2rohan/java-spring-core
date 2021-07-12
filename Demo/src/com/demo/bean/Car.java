package com.demo.bean;

import com.demo.service.Engine;

public class Car implements Engine {
	
	@Override
	public void start() {
		System.out.println("Car started running !");
	}

}

package com.demo.bean;

import com.demo.service.Engine;

public class Bike implements Engine {
	
	@Override
	public void start() {
		System.out.println("Bike started running !");
	}

}

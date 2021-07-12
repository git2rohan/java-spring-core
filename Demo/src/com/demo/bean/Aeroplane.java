package com.demo.bean;

import com.demo.service.Engine;

public class Aeroplane implements Engine {
	
	@Override
	public void start() {
		System.out.println("Aeroplane started running !");
	}
}

package com.advance.annotation;

import org.springframework.stereotype.Component;

@Component
public class Desk implements Assets {

	@Override
	public void assetName() {
		// TODO Auto-generated method stub
		System.out.println("This is greeting from Assets team - Desk");
	}

	
}

package com.advance.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Assets {

	@Override
	public void assetName() {
		// TODO Auto-generated method stub
		System.out.println("This is a greeting from Asset team - desktop");
	}

	
}

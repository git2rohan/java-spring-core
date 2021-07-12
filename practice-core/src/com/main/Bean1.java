package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {

	@Value("${bean1.name}")
	String name;
	@Value("${bean1.surename}")
	String surename;
	
	@Autowired
	Bean2 bean2;
	
}

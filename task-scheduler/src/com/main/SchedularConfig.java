package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.main.schedular.SchedularBean;

@Configuration
@EnableScheduling
public class SchedularConfig {
	
	@Bean
	public SchedularBean schedular()
	{
		return new SchedularBean();
	}
}

package com.main.schedular;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedularBean {

	//Seconds Minutes Hours dayOfMonth Month DayOfWeek
	@Scheduled(cron="*/3 * * * * *") //Run job after 3 seconds ( it waits 3 secs for 1st msg as well )
	//@Scheduled(fixedDelay = 5000)
	//@Scheduled(fixedRate = 5000)
	public void scheduleSomething()
	{
		System.out.println("Scheduled String");
	}
}

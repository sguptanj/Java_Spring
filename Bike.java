package com.tcs.adMarLearnings;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void Move()
	{
		System.out.println("System is Driving the Bike");
	}

}

package com.tcs.adMarLearnings;

/**
@author: Siddharth Gupta
@date: 27-September-2020
@functionality: User Enters the temperature and gets the Output in respective units (C and F)
@design type: POJO
@flow: TempMain.java -> Temperature.java
**/

public class Temperature {
	
	private static float FACTOR = 32f;
	private static float FACTOR2 = 1.8f;
	
	private float farenhiet = 0.0f;
	private float celsius = 0.0f;
	private float tempCelsius = 0.0f;
	
	// This method converts the farenhiet temperature to celsius temperature
	public float calculateCelsius(float farenhiet)
	{
		farenhiet -= FACTOR;
		celsius = farenhiet / FACTOR2;
		return celsius;
	}
	
	public float calculateFarenheit(float celsius)
	{
		celsius += FACTOR;
		farenhiet = celsius * FACTOR2;
		return farenhiet;
	}

}

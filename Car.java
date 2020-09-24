package com.tcs.adMarLearnings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	private Brake bra;
	
	
	public Brake getBra() {
		return bra;
	}


	public void setBra(Brake bra) {
		this.bra = bra;
	}


	public void Move()
	{
		System.out.println("System is Driving the Car");
		System.out.println(bra.getApplyBrake());
	}

}

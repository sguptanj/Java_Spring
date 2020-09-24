package com.tcs.adMarLearnings;

import org.springframework.stereotype.Component;


public class Brake {
	
	private String applyBrake = "BMW";

	@Override
	public String toString() {
		return "Brake [applyBrake=" + applyBrake + "]";
	}

	public String getApplyBrake() {
		return applyBrake;
	}

	public void setApplyBrake(String applyBrake) {
		this.applyBrake = applyBrake;
	}
	
	

}

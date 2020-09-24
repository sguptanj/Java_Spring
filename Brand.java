package com.tcs.adMarLearnings;

public class Brand {
	
	private String companyName = "BMW";

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Brand [companyName=" + companyName + "]";
	}
	

}

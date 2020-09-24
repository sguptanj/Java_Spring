package com.tcs.adMarLearnings;

public class HelloWorld{
	
	private String message;

	// Getters and setters
	public void setMessage(String message) {
		this.message = message;
	}

	public void getMessage() {
		System.out.println("Your Message : " + message);
	}
	
	// Initialization and Destruction Calls 
	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

}

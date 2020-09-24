package com.tcs.adMarLearnings;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	   public static void main(String[] args) {
	      ApplicationContext context = new 
	    		  ClassPathXmlApplicationContext("file:src/main/java/com/tcs/adMarLearnings/spring.xml");
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	      
	      /**
	       * Testing Functionality: Singleton Bean
	       * Thus the object that the bean should return will be only 1
	       * 
	       */
	      obj.setMessage("I'm object A");
	      obj.getMessage();
	      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
	      objB.getMessage();
	      
	      
	      
	   }
	}

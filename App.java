package com.tcs.adMarLearnings;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * To return the Object of class specified in the spring.xml
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	
  ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/tcs/adMarLearnings/spring.xml");
    	Vehicle obj = (Vehicle) context.getBean("bike");
    	obj.Move();
    	
    	// Setter Injection
    	Brand br = (Brand) context.getBean("brand");
    	System.out.println(br);
    	
    	// Constructor Injection
    	Tyre myTyre = (Tyre) context.getBean("tyre");
    	System.out.println(myTyre);
    	
    	//
    	Brake bk = (Brake) context.getBean("brake");
    	System.out.println(bk);
    	
    	// Autowired code
    	Car obj2 = (Car) context.getBean("car");
    	obj2.Move();
    }
}

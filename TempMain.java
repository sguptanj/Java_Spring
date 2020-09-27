package com.tcs.adMarLearnings;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
@author: Siddharth Gupta
@date: 27-September-2020
@functionality: User Enters the temperature and gets the Output in respective units (C and F)
@design type: POJO
@flow: TempMain.java -> Temperature.java
**/

public class TempMain {

	public static void main(String[] args) {
		String a;
		float temp;
		System.out.println("**************************************");
		System.out.println("This is a Temp Convertor");
		System.out.println("Enter C -> To convert to Celcius\nEnter F -> To convert to Farehiet");
		System.out.print("Please Enter your chooice? ");
		Scanner input = new Scanner(System.in);
		a = input.nextLine();
		if (a.equalsIgnoreCase("c") ){
			System.out.print("Please Enter temp in Celsius: ");
			Scanner input2 = new Scanner(System.in);
			temp = input2.nextFloat();
			ApplicationContext context = new ClassPathXmlApplicationContext ("file:src/main/java/com/tcs/adMarLearnings/bean.xml");
			Temperature temperat = (Temperature) context.getBean("temperature");
			System.out.println("The temp in Farheniet is "+ temperat.calculateFarenheit(temp));
		}
		else if (a.equalsIgnoreCase("f") ){
			System.out.print("Please Enter temp in Farenheit: ");
			Scanner input2 = new Scanner(System.in);
			temp = input2.nextFloat();
			ApplicationContext context = new ClassPathXmlApplicationContext ("file:src/main/java/com/tcs/adMarLearnings/bean.xml");
			Temperature temperat = (Temperature) context.getBean("temperature");
			System.out.println("The temp in Farheniet is "+ temperat.calculateCelsius(temp));
			
		}

	}

}

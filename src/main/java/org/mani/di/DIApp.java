package org.mani.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApp {
	 
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("diApplicationContext.xml");
		Coach theCoach = context.getBean(Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		
		
		context.close();
	}

}

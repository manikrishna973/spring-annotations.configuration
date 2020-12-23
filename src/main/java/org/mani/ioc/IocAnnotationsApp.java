package org.mani.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAnnotationsApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("iocApplicationContext.xml");
		
		//Annotations are the Meta-Data/labels of the class
		Coach theCoach = context.getBean("cricketCoach", Coach.class); //default bean id same as class Name with first letter lower case

		System.out.println(theCoach.getDailyWorkout());

		context.close();
	}
}

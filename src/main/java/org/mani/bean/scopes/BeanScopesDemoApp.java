package org.mani.bean.scopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesDemoApp {
 
	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new
		                ClassPathXmlApplicationContext("scopesApplicationContext.xml");
		
		//read the beans from spring container
		
		Person personObj = context.getBean("person",Person.class);
		
		Person personObj2 = context.getBean("person",Person.class);

		
		boolean result =(personObj==personObj2);
		
		System.out.println("pointing to the same object: "+result);
		
		System.out.println("\n Memory Location of person: "+personObj);
		System.out.println("\n Memory Location of person: "+personObj2);
		
		//close the context
		context.close();

		
	}
}

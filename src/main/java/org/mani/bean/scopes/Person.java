package org.mani.bean.scopes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Person  {

	public Person() {
		System.out.println(">> Inside Person Object constructor"+"\n");
	}
	
	
	//init method and destroy method using annotations
	
	/**
	 * Method name The method can have any method name.
	 * 
	 * Arguments The method can not accept any arguments. The method should be
	 * no-arg.
	 */
	
	@PostConstruct
	public void doMystartUpStuff() {
		System.out.println("\n Inside doMystartUpStuff(): Inserting few records of type person");
	}
	
	
    //need implement DisposableBean interface and do the cleanUpStuff On destroy() method 
	//if bean scope is prototype
	@PreDestroy
	public void doMyCleanUpStuff() throws Exception {
		System.out.println("\n Inside doMyCleanUpStuff()");
		
	}
}

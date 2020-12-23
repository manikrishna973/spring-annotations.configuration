package org.mani.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


	public TennisCoach() {
		
	} 
	
	//private FortuneService fortuneService;
	
	/**
	 * Field Injection
	 */
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
		
	/**
	 * <h4>constructor injection</h4>
	 * @param fortuneService
	 */
	/*
	 * @Autowired public TennisCoach(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
    
	
	
	/**
	 * Qualifying a specific implementation using @Qualifier
	 * @param fortuneService
	 */
  /*@Autowired
	public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	
    /**
     * Setter-Injection
     * @param fortuneService
     */
	
  /*   @Autowired   
	public void setFortuneService(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	} */

   
	/**
	 * Method Injection
	 * @param fortuneService
	 */
 /*	@Autowired
    public void injectTheDependency(@Qualifier("happyFortuneService")FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    } */
	




	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Serve";
	}



	/**
	 * Coach now provides daily fortuneSerive
	 * using the dependency called FortuneSerivce
	 */
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


	
	

}

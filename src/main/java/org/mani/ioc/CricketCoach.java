package org.mani.ioc;

import org.springframework.stereotype.Component;

@Component //Meta-Data
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice Fast bowling";
	}

}

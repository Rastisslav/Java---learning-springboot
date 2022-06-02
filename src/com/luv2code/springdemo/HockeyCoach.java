package com.luv2code.springdemo;

public class HockeyCoach implements Coach {

    private FortuneService fortuneService;
    public HockeyCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Run around";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

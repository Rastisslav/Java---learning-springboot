package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService){
        fortuneService = theFortuneService;
    }


    @Override
    public String getDailyWorkout(){

        return "Spend 30m on batting pracitice";
    }

    @Override
    public String getDailyFortune() {

        // use my fortuneSercive to get a fortune

        return fortuneService.getFortune();
    }
}

package com.luv2code.springdemo;

public class HockeyCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Run around";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}

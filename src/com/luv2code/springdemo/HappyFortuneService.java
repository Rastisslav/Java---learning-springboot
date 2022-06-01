package com.luv2code.springdemo;
import java.util.Random;

public class HappyFortuneService implements FortuneService{

    //String[] fortunes = {"Today is ur lucky day","Today is ur very lucky day","Today is ur luckiest day"};

    @Override
    public String getFortune() {
        return "Today is ur lucky day";
    }
}

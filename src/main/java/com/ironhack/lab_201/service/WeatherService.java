package com.ironhack.lab_201.service;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class WeatherService {
    private final Random random = new Random();

    public int getCurrentTemperature() {
        return random.nextInt(51) - 10; // Range: -10 to 40
    }

    public String getWeatherCondition() {
        String[] conditions = {"Sunny", "Rainy", "Cloudy", "Windy"};
        return conditions[random.nextInt(conditions.length)];
    }

    public int getWindSpeed() {
        return random.nextInt(101); // Range: 0 to 100
    }
}
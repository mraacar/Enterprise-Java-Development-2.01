package com.ironhack.lab_201.model;

public class WeatherInfo {
    private int temperature;
    private String condition;
    private int windSpeed;

    public WeatherInfo(int temperature, String condition, int windSpeed) {
        this.temperature = temperature;
        this.condition = condition;
        this.windSpeed = windSpeed;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }

    public int getWindSpeed() {
        return windSpeed;
    }
}

package com.example.springdemo.controller;

import com.example.springdemo.model.WeatherInfo;
import com.example.springdemo.service.WeatherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public int getTemperature() {
        return weatherService.getCurrentTemperature();
    }

    @GetMapping("/condition")
    public String getCondition() {
        return weatherService.getWeatherCondition();
    }

    @GetMapping("/wind")
    public int getWindSpeed() {
        return weatherService.getWindSpeed();
    }

    @GetMapping("/all")
    public WeatherInfo getWeatherInfo() {
        return new WeatherInfo(
                weatherService.getCurrentTemperature(),
                weatherService.getWeatherCondition(),
                weatherService.getWindSpeed()
        );
    }
}
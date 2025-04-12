package com.ironhack.lab_201.controller;

import com.ironhack.lab_201.model.WeatherInfo;
import com.ironhack.lab_201.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/temperature")
    public ResponseEntity<Integer> getTemperature() {
        return ResponseEntity.ok(weatherService.getCurrentTemperature());
    }

    @GetMapping("/condition")
    public ResponseEntity<String> getCondition() {
        return ResponseEntity.ok(weatherService.getWeatherCondition());
    }

    @GetMapping("/wind")
    public ResponseEntity<Integer> getWindSpeed() {
        return ResponseEntity.ok(weatherService.getWindSpeed());
    }

    @GetMapping("/all")
    public ResponseEntity<WeatherInfo> getAllWeather() {
        WeatherInfo info = new WeatherInfo(
                weatherService.getCurrentTemperature(),
                weatherService.getWeatherCondition(),
                weatherService.getWindSpeed()
        );
        return ResponseEntity.ok(info);
    }
}
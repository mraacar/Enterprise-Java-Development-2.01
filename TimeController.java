package com.example.springdemo.controller;

import com.example.springdemo.model.TimeInfo;
import com.example.springdemo.service.TimeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    public String getCurrentTime() {
        return timeService.getCurrentTime().toString();
    }

    @GetMapping("/date")
    public String getCurrentDate() {
        return timeService.getCurrentDate().toString();
    }

    @GetMapping("/day")
    public String getCurrentDayOfWeek() {
        return timeService.getCurrentDayOfWeek().toString();
    }

    @GetMapping("/all")
    public TimeInfo getAllTimeInfo() {
        return new TimeInfo(
                timeService.getCurrentTime().toString(),
                timeService.getCurrentDate().toString(),
                timeService.getCurrentDayOfWeek().toString()
        );
    }
}
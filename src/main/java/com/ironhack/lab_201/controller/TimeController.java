package com.ironhack.lab_201.controller;

import com.ironhack.lab_201.model.TimeInfo;
import com.ironhack.lab_201.service.TimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TimeController {
    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping("/time")
    public ResponseEntity<String> getTime() {
        return ResponseEntity.ok(timeService.getCurrentTime().toString());
    }

    @GetMapping("/date")
    public ResponseEntity<String> getDate() {
        return ResponseEntity.ok(timeService.getCurrentDate().toString());
    }

    @GetMapping("/day")
    public ResponseEntity<String> getDay() {
        return ResponseEntity.ok(timeService.getCurrentDay().toString());
    }

    @GetMapping("/all")
    public ResponseEntity<TimeInfo> getAllTimeInfo() {
        TimeInfo info = new TimeInfo(
                timeService.getCurrentTime().toString(),
                timeService.getCurrentDate().toString(),
                timeService.getCurrentDay().toString()
        );
        return ResponseEntity.ok(info);
    }
}


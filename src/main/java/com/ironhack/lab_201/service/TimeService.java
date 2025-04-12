package com.ironhack.lab_201.service;

import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
public class TimeService {
    public LocalTime getCurrentTime() {
        return LocalTime.now();
    }

    public LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    public DayOfWeek getCurrentDay() {
        return LocalDate.now().getDayOfWeek();
    }
}
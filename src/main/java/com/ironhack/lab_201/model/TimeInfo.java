package com.ironhack.lab_201.model;

public class TimeInfo {
    private String time;
    private String date;
    private String day;

    public TimeInfo(String time, String date, String day) {
        this.time = time;
        this.date = date;
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }
}
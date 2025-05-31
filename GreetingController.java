package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String getPersonalizedGreeting(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping("/add/{num1}/{num2}")
    public int getSum(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public int getProduct(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }
}
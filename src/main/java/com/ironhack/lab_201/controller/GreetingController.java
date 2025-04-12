package com.ironhack.lab_201.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String sayHelloToName(@PathVariable String name) {
        return "Hello " + name + "!";
    }


    @GetMapping("/add/{num1}/{num2}")
    public ResponseEntity<?> add(@PathVariable String num1, @PathVariable String num2) {
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            return ResponseEntity.ok(a + b);
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid numbers provided");
        }
    }

    @GetMapping("/multiply/{num1}/{num2}")
    public ResponseEntity<?> multiply(@PathVariable String num1, @PathVariable String num2) {
        try {
            int a = Integer.parseInt(num1);
            int b = Integer.parseInt(num2);
            return ResponseEntity.ok(a * b);
        } catch (NumberFormatException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid numbers provided");
        }
    }
}
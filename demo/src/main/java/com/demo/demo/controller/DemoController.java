package com.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController; // Add this import

@RestController

public class DemoController {
    
    @GetMapping("/hello")
    public String hello() {
        System.err.println("Returning Hello, World!");
        return "Hello, World!";
    }
}

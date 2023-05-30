package com.example.differentApiCalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/get")
    public String message(){
        return "Hello BridgeLabz";
    }
}

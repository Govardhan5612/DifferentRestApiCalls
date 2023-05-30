package com.example.differentApiCalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/get")
    public String message(){
        return "Hello BridgeLabz";
    }
    @GetMapping("/get1")
    public String message(@RequestParam String name){
        return name;
    }
    @GetMapping("/get2/{name}")
    public String message1(@PathVariable String name){
        return "Hii "+name+" from BridgeLabz";
    }
}

package com.example.differentApiCalls.controller;

import com.example.differentApiCalls.dyo.User;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/get3")
    public String message2(@RequestBody User user){
        return "Hii "+user.firstName+" "+user.lastName+" from BridgeLabz";
    }
    @PutMapping("/get4/{firstName}")
    public String message3(@PathVariable String firstName,@RequestParam String lastName){
        return "Hii "+firstName+" "+lastName+" from BridgeLabz";
    }
}

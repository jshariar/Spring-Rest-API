package com.example.joy.apiapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting(){
        return "Hi there, Welcome to the homepage";
    }

    @RequestMapping("/products")
    public String getProducts(){
        return "product page";
    }
}

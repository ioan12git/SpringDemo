package com.example.springdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControler {
    @RequestMapping
    public String helloW(){
        return "Hello World";
    }
}

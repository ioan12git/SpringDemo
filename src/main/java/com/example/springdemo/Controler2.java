package com.example.springdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler2 {
    @GetMapping(value = "/hello2")
    public String hello(@RequestParam String firstName,@RequestParam String lastName) {
        return String.format("Hello "+ firstName+" "+lastName);
    }
}

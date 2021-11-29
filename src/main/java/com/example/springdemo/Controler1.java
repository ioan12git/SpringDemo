package com.example.springdemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler1 {
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String firstName) {
        return String.format("Hello "+ firstName);
    }
}

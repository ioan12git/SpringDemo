package com.example.springdemo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler3 {

    @RequestMapping("/hello3/{sex}") // daca sex nu este masculin sau feminin sa returnez 400 si un mesaj
    public String getAge(@PathVariable String sex,@RequestParam int age){
        return sex+""+age;
    }
    @RequestMapping("/hello3")//sa fie optional name
    public String getName(@RequestParam String name){
        return name;
    }
}

package com.example.springbootjava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Michał!";
    }
}

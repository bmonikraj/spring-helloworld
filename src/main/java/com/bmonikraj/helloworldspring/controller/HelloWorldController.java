package com.bmonikraj.helloworldspring.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/spring")
public class HelloWorldController {
    @GetMapping(value = "/index", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index(){
        return "Greetings from Spring Boot!";
    }
}

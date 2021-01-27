package com.bmonikraj.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @RequestMapping(value = "/index", produces = MediaType.TEXT_PLAIN_VALUE)
    public String index(){
        return "Hello, World!";
    }
}

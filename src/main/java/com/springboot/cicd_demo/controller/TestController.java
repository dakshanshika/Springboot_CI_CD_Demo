package com.springboot.cicd_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String welcome(){
        return "Hello! welcome in CI CD Demo.";
    }
}

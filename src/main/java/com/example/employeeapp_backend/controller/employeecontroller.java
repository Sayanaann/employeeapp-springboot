package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class employeecontroller {

    @GetMapping("/")
    public String Welcomepage(){
        return "welcome to my website";

    }
}

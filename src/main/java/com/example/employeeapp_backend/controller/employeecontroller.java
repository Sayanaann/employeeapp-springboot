package com.example.employeeapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class employeecontroller {

    @GetMapping("/")
    public String Welcomepage(){
        return "welcome to my website";

    }
    @GetMapping("/add")
    public String Addpage(){
        return "Add the employee";

    }
    @GetMapping("/search")
    public String Searchpage(){
        return "Search an employee";

    }
    @GetMapping("/edit")
    public String Editpage(){
        return "Edit an employee";

    }
}

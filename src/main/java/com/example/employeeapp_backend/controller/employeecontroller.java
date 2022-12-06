package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class employeecontroller {

    @GetMapping("/")
    public String Welcomepage() {
        return "welcome to Employee app";

    }

    @PostMapping(path = "/add", consumes = "application/json", produces = "application/json")
    public String Addemployee(@RequestBody Employee e) {
        System.out.println(e.getEmpname());
        System.out.println(e.getEmpcode());
        System.out.println(e.getDesignation());
        System.out.println(e.getSalary());
        System.out.println(e.getCompanyname());
        System.out.println(e.getMobileno());
        System.out.println(e.getUsername());
        System.out.println(e.getPassword());
        return "Employee added successfully";

    }
}
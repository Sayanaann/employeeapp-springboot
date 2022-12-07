package com.example.employeeapp_backend.controller;

import com.example.employeeapp_backend.dao.Employeedao;
import com.example.employeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class employeecontroller {
@Autowired
private Employeedao dao;
@CrossOrigin(origins = "*")

    @GetMapping("/")
    public String Welcomepage() {
        return "welcome to Employee app";

    }
    @CrossOrigin(origins = "*")

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
        dao.save(e);
        return "Employee added successfully";

    }
    @CrossOrigin(origins = "*")
      @GetMapping("/viewall")
    public List<Employee> viewall() {

    return (List<Employee>) dao.findAll();
      }


   @CrossOrigin(origins = "*")

    @PostMapping(path = "/search", consumes = "application/json", produces = "application/json")
    public List<Employee> Searchemployee(@RequestBody Employee e) {
        String empcode = String.valueOf(e.getEmpcode());
        System.out.println(empcode);
        return (List<Employee>) dao.Searchemployee(e.getEmpcode());
    }
}
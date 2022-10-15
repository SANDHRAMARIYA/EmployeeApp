package com.nestdigital.EmployeeApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String Homepage()
    {
        return "Welcome to my homepage";
    }


    @GetMapping("/add")
    public String EmployeeAdd()
    {
        return  "Welcome to employee add";
    }


    @GetMapping("/search")
    public String EmployeeSearch()
    {
        return  "Welcome to employee search";
    }

    @GetMapping("/delete")
    public String EmployeeDelete()
    {
        return  "Welcome to employee delete";
    }

}

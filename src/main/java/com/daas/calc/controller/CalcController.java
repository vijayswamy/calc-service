package com.daas.calc.controller;

import com.daas.calc.service.CalcService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/calculate")
public class CalcController {

    @Autowired
    CalcService calcService;

    @GetMapping(path="/test")
    public String test(){
        return "Hello ! This is my version 1";
    }
    
    @GetMapping(path="/add/{n1}/{n2}")
    public int add(@PathVariable int n1,@PathVariable int n2){
        return calcService.add(n1,n2);
    }

    @GetMapping(path="/difference/{n1}/{n2}")
    public int difference(@PathVariable int n1,@PathVariable int n2){
        return calcService.difference(n1,n2);
    }

    @GetMapping(path="/multiply/{n1}/{n2}")
    public int multiply(@PathVariable int n1,@PathVariable int n2){
        return calcService.multiply(n1,n2);
    }

    @GetMapping(path="/divide/{n1}/{n2}")
    public double divide(@PathVariable int n1,@PathVariable int n2){
        return calcService.divide(n1,n2);
    }

}

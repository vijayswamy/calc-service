package com.daas.calc.service;

import org.springframework.stereotype.Service;
@Service
public class CalcService {

    public int add(int a, int b){
        return a+b;
    }
    public int difference(int a,int b){
        return Math.abs(a-b);
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public int divide(int a,int b)
    {
        return  a/b;
    }

}

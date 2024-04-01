package com.vunh.service;

public class MethodController {

    public static Double MathDiv(double a, double b){
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("Invalid!");
        }
        return a / b;
    }
}

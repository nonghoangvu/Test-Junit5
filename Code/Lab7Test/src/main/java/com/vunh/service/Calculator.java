package com.vunh.service;

public class Calculator {
    public static double MathTime(double a, double b){
        return a * b;
    }
    public static Double MathDiv(double a, double b){
        if(a == 0 || b == 0){
            throw new IllegalArgumentException("Invalid!");
        }
        return a / b;
    }
}

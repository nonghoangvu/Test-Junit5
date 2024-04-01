package com.vunh.service;

public class StudentGrader {
    public static String studentGrader(double mark){
        if(mark < 0 || mark > 100){
            throw new IllegalArgumentException("Invalid score!!");
        }else if(mark >= 81){
            return "A";
        } else if (mark >= 71 && mark <= 80) {
            return "B";
        }else if (mark >= 61 && mark <= 70){
            return "C";
        } else if (mark >= 41 && mark <= 60) {
            return "D";
        }else {
            return "F";
        }
    }
}

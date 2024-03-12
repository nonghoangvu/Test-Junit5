package com.vunh.lab2;

public class Cal {
    public int methodSum(int a, int b){
        return a + b;
    }
    public int methodMul(int a, int b){
        return a * b;
    }
    public long methodCalFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

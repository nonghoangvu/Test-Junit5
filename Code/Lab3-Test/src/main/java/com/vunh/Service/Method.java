package com.vunh.Service;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.OptionalDouble;

@AllArgsConstructor
public class Method {
    private String name;

    public static int sumNumber(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            return 0;
        }
    }

    public static float divNumber(float a, float b) {
        try {
            if (a == 0 || b == 0) {
                return -1;
            }
            return a / b;
        } catch (Exception e) {
            return -1;
        }
    }

    public static double calculateAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new ArithmeticException("Cannot calculate average of an empty list.");
        } else if (numbers.contains(0)) {
            throw new ArithmeticException("Cannot calculate average with zero in the list.");
        }
        OptionalDouble result = numbers.stream().mapToInt(Integer::intValue).average();
        if (result.isPresent()) {
            return result.getAsDouble();
        }
        return -1;
    }

    public static int getElementAtIndex(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }
        return array[index];
    }

    public String getName() {
        if (this.name == null) {
            throw new NullPointerException("Profile is empty.");
        }
        return this.name;
    }
}

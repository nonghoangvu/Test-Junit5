package com.vunh.Service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalTest {
    @Test
    public void testSumFirst(){
        assertEquals(10, Cal.sumNumber(5, 5));
    }

    @Test
    public void testSumSecond(){
        assertEquals(8, Cal.sumNumber(3, 5));
    }

    @Test
    public void testSumThird() {
        assertEquals(0, Cal.sumNumber(Integer.parseInt("5abc"), 5));
    }

    //----------------------------------------------------------------
    @Test
    public void testDivFirst(){
        assertEquals(1, Cal.divNumber(5, 5));
    }

    @Test
    public void testDivSecond(){
        assertEquals(0.6000000238418579, Cal.divNumber(3, 5));
    }

    @Test
    public void testDivThird(){
        assertEquals(-1, Cal.divNumber(5, 0));
    }

    //----------------------------------------------------------------
    @Test
    public void testAverageFirst(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertEquals(2, Cal.calculateAverage(numbers));
    }
    @Test
    public void testAverageSecond(){//List number is empty
        ArrayList<Integer> numbers = new ArrayList<>();
        assertEquals(0, Cal.calculateAverage(numbers));
    }

    @Test
    public void testAverageThird(){//Calculate average with zero in the list.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);
        numbers.add(3);
        assertEquals(0, Cal.calculateAverage(numbers));
    }

    //----------------------------------------------------------------
    @Test
    public void testGetElementAtIndexFirst(){
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        assertEquals(3, Cal.getElementAtIndex(array, index));
    }

    @Test
    public void testGetElementAtIndexSecond(){
        int[] array = {1, 2, 3, 4, 5};
        int index = -1;
        assertEquals(3, Cal.getElementAtIndex(array, index));
    }

    @Test
    public void testGetElementAtIndexThird(){
        int[] array = {1, 2, 3, 4, 5};
        int index = 5;
        assertEquals(3, Cal.getElementAtIndex(array, index));
    }

    //----------------------------------------------------------------
    @Test
    public void testGetNameFirst(){
        Cal user = new Cal(null);
        assertEquals("Not found", user.getName());
    }

    @Test
    public void testGetNameSecond(){
        Cal user = new Cal("Vu");
        assertEquals("Vu", user.getName());
    }
}
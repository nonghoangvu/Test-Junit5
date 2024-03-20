package com.vunh.Service;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MethodTest {
    @Test
    public void testSumFirst() {
        assertEquals(10, Method.sumNumber(5, 5));
    }

    @Test
    public void testSumSecond() {
        assertEquals(8, Method.sumNumber(3, 5));
    }

    @Test
    public void testSumThird() {
        assertEquals(0, Method.sumNumber(Integer.parseInt("5abc"), 5));
    }

    //----------------------------------------------------------------
    @Test
    public void testDivFirst() {
        assertEquals(1, Method.divNumber(5, 5));
    }

    @Test
    public void testDivSecond() {
        assertEquals(0.6000000238418579, Method.divNumber(3, 5));
    }

    @Test
    public void testDivThird() {
        assertEquals(-1, Method.divNumber(5, 0));
    }

    //----------------------------------------------------------------
    @Test
    public void testAverageFirst() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        assertEquals(2, Method.calculateAverage(numbers));
    }

    @Test
    public void testAverageSecond() {//List number is empty
        List<Integer> numbers = new ArrayList<>();
        assertThrows(ArithmeticException.class, () -> Method.calculateAverage(numbers));
    }

    @Test
    public void testAverageThird() {//Calculate average with zero in the list.
        List<Integer> numbers = Arrays.asList(1, 2, 0, 3);
        assertThrows(ArithmeticException.class, () -> Method.calculateAverage(numbers));
    }

    //----------------------------------------------------------------
    @Test
    public void testGetElementAtIndexFirst() {
        int[] array = {1, 2, 3, 4, 5};
        int index = 2;
        assertEquals(3, Method.getElementAtIndex(array, index));
    }

    @Test
    public void testGetElementAtIndexSecond() {
        int[] array = {1, 2, 3, 4, 5};
        int index = -1;
        assertThrows(IndexOutOfBoundsException.class, () -> Method.getElementAtIndex(array, index));
    }

    @Test
    public void testGetElementAtIndexThird() {
        int[] array = {1, 2, 3, 4, 5};
        int index = 5;
        assertThrows(IndexOutOfBoundsException.class, () -> Method.getElementAtIndex(array, index));
    }

    //----------------------------------------------------------------
    @Test
    public void testGetNameFirst() {
        Method user = new Method(null);
        assertThrows(NullPointerException.class, user::getName);
    }

    @Test
    public void testGetNameSecond() {
        Method user = new Method("Nong Hoang Vu");
        assertEquals("Nong Hoang Vu", user.getName());
    }
}
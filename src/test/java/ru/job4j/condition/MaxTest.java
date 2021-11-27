package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenLeft1Right0then1() {
        int left = 1;
        int right = 0;
        int result = Max.max(left, right);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void whenLeft0Right2then2() {
        int left = 0;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    public void whenLeft3Right3then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertEquals(expected, result);
    }
}
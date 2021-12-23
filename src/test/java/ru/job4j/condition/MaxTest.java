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

    @Test
    public void whenFirst3Second4Third1then4() {
        int first = 3;
        int second = 4;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void whenFirst5Second7Third8Forth2then8() {
        int first = 5;
        int second = 7;
        int third = 8;
        int forth = 2;
        int result = Max.max(first, second, third, forth);
        int expected = 8;
        assertEquals(expected, result);
    }
}
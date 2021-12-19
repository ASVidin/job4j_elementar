package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 0;

        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when15to25then4() {
        int x1 = 1;
        int x2 = 5;
        int y1 = 5;
        int y2 = 5;

        double expected = 4;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when34to84then5() {
        int x1 = 3;
        int x2 = 8;
        int y1 = 4;
        int y2 = 4;

        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when28to29then1() {
        int x1 = 2;
        int x2 = 2;
        int y1 = 8;
        int y2 = 9;

        double expected = 1;
        double out = Point.distance(x1, y1, x2, y2);

        assertEquals(expected, out, -0.01);
    }
}
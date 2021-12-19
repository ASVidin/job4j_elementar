package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double out = point1.distance(point2);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when15to25then4() {
        Point point1 = new Point(1, 5);
        Point point2 = new Point(5, 5);
        double expected = 4;
        double out = point1.distance(point2);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when34to84then5() {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(8, 4);
        double expected = 5;
        double out = point1.distance(point2);

        assertEquals(expected, out, -0.01);
    }

    @Test
    public void when28to29then1() {
        Point point1 = new Point(2, 8);
        Point point2 = new Point(2, 9);
        double expected = 1;
        double out = point1.distance(point2);

        assertEquals(expected, out, -0.01);
    }
}
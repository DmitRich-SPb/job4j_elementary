package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to11then1dot41() {
        double expected = 1.41;
        int x1 = 0;
        int y1 = 0;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to42then3dot16() {
        double expected = 3.16;
        int x1 = 1;
        int y1 = 1;
        int x2 = 4;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
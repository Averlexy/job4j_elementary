package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 4;
        x1 = 1;
        y1 = 0;
        x2 = 3;
        y2 = 2;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 16;
        x1 = 1;
        y1 = 0;
        x2 = 5;
        y2 = 4;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);

        expected = 25;
        x1 = 6;
        y1 = 1;
        x2 = 11;
        y2 = 6;
        out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then0() {
        double expected = 0;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to32then4() {
        double expected = 4;
        int x1 = 1;
        int y1 = 0;
        int x2 = 3;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to54then16() {
        double expected = 16;
        int x1 = 1;
        int y1 = 0;
        int x2 = 5;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when61to116then25() {
        double expected = 25;
        int x1 = 6;
        int y1 = 1;
        int x2 = 11;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
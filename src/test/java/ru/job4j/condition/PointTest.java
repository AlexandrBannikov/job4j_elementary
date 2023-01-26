package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when31toMinus14then5dot0() {
        int x1 = 3;
        int y1 = 1;
        int x2 = -1;
        int y2 = 4;
        double expected = 5.0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when43to32then1dot41() {
        int x1 = 4;
        int y1 = 3;
        int x2 = 3;
        int y2 = 2;
        double expected = 1.41;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when23to41then2dot82() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 1;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to44then3dot60() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 4;
        int y2 = 4;
        double expected = 3.60;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
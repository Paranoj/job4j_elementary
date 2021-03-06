package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        double expected = 2;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when12to34then2dot83() {
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);
        double dist = a.distance(b);
        double expected = 2.83;
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void when13to37then4dot47() {
        Point a = new Point(1, 3);
        Point b = new Point(3, 7);
        double dist = a.distance(b);
        double expected = 4.47;
        Assert.assertEquals(expected, dist, 0.01);
    }
}

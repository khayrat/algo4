package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.*;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by glende on 18.03.17.
 */
public class ClosestPair_1_2_1Test {
    @Test
    public void findClosestPair() {
        Point2D[] points = {
            point(3, 2), point(0, 0), point(10, 10), point(1, 1), point(15, 15)
        };

        Pair expected = new Pair(point(0, 0), point(1, 1));
        Pair closest  = ClosestPair_1_2_1.findClosestPair(points);
        Assert.assertEquals(expected, closest);
    }

    private Point2D point(int x, int y) {
        return new Point2D(x, y);
    }
}

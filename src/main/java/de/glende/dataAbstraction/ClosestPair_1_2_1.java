package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.*;

/**
 * Created by glende on 18.03.17.
 */
public class ClosestPair_1_2_1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        Point2D[] points = generateRandomPoints(N);
        drawPoints(points);
        Pair closestPair = findClosestPair(points);

        StdOut.println("Closest Pair: " + closestPair);
    }

    public static void drawPoints(Point2D[] points) {
        int N = points.length;
        for (int i = 0; i < N; i++) {
            points[i].draw();
        }
    }

    public static Pair findClosestPair(Point2D[] points) {
        Pair closestPair = new Pair(
                new Point2D(Double.MIN_VALUE, Double.MIN_VALUE),
                new Point2D(Double.MAX_VALUE, Double.MAX_VALUE)
        );

        long counter = 0;
        int N = points.length;
        for (int i=0; i<N-1; i++) {
            Point2D a = points[i];
            for (int j = i+1; j < N; j++) {
                counter++;
                Point2D b = points[j];
                if (a.distanceSquaredTo(b) < closestPair.distanceSquared()) {
                    closestPair = new Pair(a, b);
                }
            }
        }
        StdOut.println("counter: " +counter);
        return closestPair;
    }

    public static Point2D[] generateRandomPoints(int N) {
        Point2D[] points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            points[i] = generateRandomPointBetween(0.0, 1.0);
        }
        return points;
    }

    private static Point2D generateRandomPointBetween(double a, double b) {
        return new Point2D(StdRandom.uniform(a, b), StdRandom.uniform(a, b));
    }
}

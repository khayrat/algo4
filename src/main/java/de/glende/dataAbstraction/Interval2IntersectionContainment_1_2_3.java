package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.*;

/**
 * Created by glende on 19.03.17.
 */
public class Interval2IntersectionContainment_1_2_3 {
    public static void main(String[] args) {
        // read N as cmdl argurment
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);
        Counter intersections = new Counter("intersections");
        Counter containments  = new Counter("containments");

        // print a box
        Interval1D xy = new Interval1D(min, max);
        Interval2D box = new Interval2D(xy, xy);
        box.draw();

        StdOut.printf("Box: %s\n", box);

        // generate N intervals2 with normal distribution between min and max
        Interval2D[] interval2s = new Interval2D[N];
        for (int i=0; i<N; i++) {
            Interval1D[] interval1s = generateInterval1s(min, max);
            interval2s[i] = new Interval2D(interval1s[0], interval1s[1]);

            // drawing
            interval2s[i].draw();
        }

        // print all pairs that intersect and contain each other
        for (int i=0; i<N-1; i++) {
            Interval2D a = interval2s[i];
            for (int j=i+1; j<N; j++) {
                Interval2D b = interval2s[j];
                if (a.intersects(b)) {
                    intersections.increment();
                }
                if (a.contains(b)) {
                    containments.increment();
                }
            }
        }

        StdOut.println(intersections);
        StdOut.println(containments);
    }

    private static Interval1D[] generateInterval1s(double min, double max) {
        Interval1D[] intervals = new Interval1D[2];

        intervals[0] = generateInterval1(min, max);
        intervals[1] = generateInterval1(min, max);

        return intervals;
    }

    private static Interval1D generateInterval1(double min, double max) {
        double a = StdRandom.uniform(min, max);
        double b = StdRandom.uniform(min, max);

        // swap if necessary
        if (a > b) {
            a=a+b;
            b=a-b;
            a=a-b;
        }

        return  new Interval1D(a, b);
    }
}

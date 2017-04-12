package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by glende on 19.03.17.
 */
public class Interval1IntersectionPairs_1_2_2 {
    public static void main(String[] args) {
        // read N as cmdl argurment
        int N = Integer.parseInt(args[0]);

        // read N intervals form stdin - each defined by a pair of double
        Interval1D[] intervals = new Interval1D[N];
        for (int i=0; i<N; i++) {
            intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }

        // print all pairs that intersect
        for (int i=0; i<N-1; i++) {
            Interval1D a = intervals[i];
            for (int j=i+1; j<N; j++) {
                Interval1D b = intervals[j];
                if (a.intersects(b)) {
                    StdOut.printf("Intersecting: %10s, %10s\n", a, b);
                }
            }
        }
    }
}

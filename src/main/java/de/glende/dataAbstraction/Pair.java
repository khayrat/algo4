package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.Point2D;

/**
 * Created by glende on 18.03.17.
 */
public class Pair {
    final private Point2D a;
    final private Point2D b;
    final private double distanceSquared;

    public  Pair(Point2D a, Point2D b) {
        this.a = a;
        this.b = b;
        this.distanceSquared = a.distanceSquaredTo(b);
    }

    public Point2D a()               { return new Point2D(a.x(), a.y()); }
    public Point2D b()               { return new Point2D(b.x(), b.y()); }
    public double  distanceSquared() { return distanceSquared; }

    @Override
    public boolean equals(Object that) {
        if (this == that)                       return true;
        if (that == null)                       return false;
        if (this.getClass() != that.getClass()) return false;

        Pair other = (Pair) that;
        if (this.a.equals(other.a) && this.b.equals(other.b)) return true;
        else                                                  return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("<->");
        sb.append(b);
        sb.append(":");
        sb.append(distanceSquared);
        return sb.toString();
    }
}

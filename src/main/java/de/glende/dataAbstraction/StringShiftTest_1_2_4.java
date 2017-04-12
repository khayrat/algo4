package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.*;

/**
 * Created by glende on 19.03.17.
 */
public class StringShiftTest_1_2_4 {
    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];

        if (isShifted(s, t)) {
            StdOut.printf("'%s' is a shifted form of '%s'\n", s, t);
        }
        else {
            StdOut.printf("'%s' is not a shifted form of '%s'\n", s, t);
        }
    }

    public static boolean isShifted(String s, String t) {
        if (s.length() != t.length()) return false;

        int n = s.length();
        int i = n;
        String shifted = s;
        while (i>0) {
            if (shifted.equals(t)) return true;
            shifted = shift(shifted, n-1);
            i--;
        }
        return false;
    }

    private static String shift(String string, int lastPos) {
        return string.charAt(lastPos) + string.substring(0, lastPos);
    }
}

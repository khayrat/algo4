package de.glende.dataAbstraction;

import edu.princeton.cs.algs4.StdOut;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * Created by glende on 18.03.17.
 */
public class StringShiftedTest_1_2_4Test {
    @Test
    public void isShiftedPassTest() {
        String s = "ACTGACG";
        String t = "TGACGAC";
        Assert.assertTrue(StringShiftTest_1_2_4.isShifted(s, t));

        s = "aaabbb";
        t = "bbaaab";
        Assert.assertTrue(StringShiftTest_1_2_4.isShifted(s, t));
    }

    @Test
    public void isShiftedFailTest() {
        String s = "abbc";
        String t = "abdc";

        Assert.assertFalse(StringShiftTest_1_2_4.isShifted(s, t));
    }

    @Test
    public void testBoundary() {
        int result = Math.abs(Integer.MIN_VALUE);
        StdOut.printf("result: %d\n", result);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void testTrukishLocale() {
        StdOut.println("BILLY".toLowerCase(new Locale("tr","TR")));
        Assert.assertEquals("bılly", "BILLY".toLowerCase(new Locale("tr","TR")));
    }
}
package com.holmes.projecteuler.problem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {

    public Problem2 problem;

    @Before
    public void setup() {
        problem = new Problem2();
    }

    /**
     * 1, 2, 3, 5, 8, < 10
     * 2 + 8 = 10.
     */
    @Test
    public void solve10() {
        Assert.assertEquals(10L, (long) problem.solve(10));
    }

    @Test
    public void solve50() {
        Assert.assertEquals(44L, (long) problem.solve(50));
    }

    @Test
    public void solve4_000_000() {
        Assert.assertEquals(4613732L, (long) problem.solve(4_000_000));
    }
}
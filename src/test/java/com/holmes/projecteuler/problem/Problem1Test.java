package com.holmes.projecteuler.problem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem1Test {

    public Problem1 problem;

    @Before
    public void setup() {
        problem = new Problem1();
    }

    @Test
    public void solve10() {
        Assert.assertEquals(23L, (long) problem.solve(10));
    }

    @Test
    public void solve1000() {
        Assert.assertEquals(233168L, (long) problem.solve(1000));
    }
}
package com.holmes.projecteuler.problem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem4Test {

    public Problem4 problem;

    @Before
    public void setup() {
        problem = new Problem4();
    }

    @Test
    public void solveTwoDigits() {
        List<Integer> minMax = new ArrayList<>(Collections.emptyList());
        minMax.add(10);
        minMax.add(99);

        List<Integer> palindromeProducts = problem.solve(minMax);
        Assert.assertEquals(2, palindromeProducts.size());
        Assert.assertTrue(palindromeProducts.contains(91));
        Assert.assertTrue(palindromeProducts.contains(99));
    }

    @Test
    public void solveThreeDigits() {
        List<Integer> minMax = new ArrayList<>(Collections.emptyList());
        minMax.add(100);
        minMax.add(999);

        List<Integer> palindromeProducts = problem.solve(minMax);
        Assert.assertEquals(2, palindromeProducts.size());
        Assert.assertTrue(palindromeProducts.contains(913));
        Assert.assertTrue(palindromeProducts.contains(993));
    }

}
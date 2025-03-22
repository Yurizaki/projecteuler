package com.holmes.projecteuler.problem;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Problem3Test {

    public Problem3 problem;

    @Before
    public void setup() {
        problem = new Problem3();
    }

    @Test
    public void solve6() {
        List<Integer> primeFactors = problem.solve(6L);
        Assert.assertEquals(2, primeFactors.size());
        Assert.assertTrue(primeFactors.contains(2));
        Assert.assertTrue(primeFactors.contains(3));
    }

    @Test
    public void solve13195() {
        List<Integer> primeFactors = problem.solve(13195L);
        Assert.assertEquals(4, primeFactors.size());
        Assert.assertTrue(primeFactors.contains(5));
        Assert.assertTrue(primeFactors.contains(7));
        Assert.assertTrue(primeFactors.contains(13));
        Assert.assertTrue(primeFactors.contains(29));
    }

    @Test
    public void solve600851475143() {
        List<Integer> primeFactors = problem.solve(600851475143L);
        Assert.assertEquals(4, primeFactors.size());
        Assert.assertTrue(primeFactors.contains(71));
        Assert.assertTrue(primeFactors.contains(839));
        Assert.assertTrue(primeFactors.contains(1471));
        Assert.assertTrue(primeFactors.contains(6857));
    }

    @Test
    public void primeNumbers() {
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal ten = BigDecimal.valueOf(10);
        BigDecimal eleven = BigDecimal.valueOf(11);

        System.out.println(ten.divide(two, 2, RoundingMode.CEILING));
        System.out.println(ten.divide(two, 2, RoundingMode.CEILING).stripTrailingZeros().toPlainString());
        System.out.println(eleven.divide(two, 2, RoundingMode.CEILING));
        System.out.println(eleven.divide(two, 2, RoundingMode.CEILING).stripTrailingZeros().toPlainString());

        //2, 3, 5, 7, 11, 13, 17, 19 and 23
        Assert.assertTrue(Problem3.isPrimeNumber(2));
        Assert.assertTrue(Problem3.isPrimeNumber(3));
        Assert.assertTrue(Problem3.isPrimeNumber(5));
        Assert.assertTrue(Problem3.isPrimeNumber(7));
        Assert.assertTrue(Problem3.isPrimeNumber(11));
        Assert.assertTrue(Problem3.isPrimeNumber(17));
        Assert.assertTrue(Problem3.isPrimeNumber(19));
        Assert.assertTrue(Problem3.isPrimeNumber(23));
        Assert.assertFalse(Problem3.isPrimeNumber(4));
        Assert.assertFalse(Problem3.isPrimeNumber(9));
        Assert.assertFalse(Problem3.isPrimeNumber(10));
        Assert.assertFalse(Problem3.isPrimeNumber(12));
        Assert.assertFalse(Problem3.isPrimeNumber(15));
        Assert.assertFalse(Problem3.isPrimeNumber(100));
    }

    @Test
    public void listPrimes() {
        List<Integer> primeNumbers = Problem3.getPrimeNumbers(10);
        Assert.assertEquals(10, primeNumbers.size());
        primeNumbers.forEach(System.out::println);
    }

}
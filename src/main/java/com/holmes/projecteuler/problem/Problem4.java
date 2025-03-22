package com.holmes.projecteuler.problem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <h1><a href="https://projecteuler.net/problem=4">Largest Palindrome Product</a></h1>
 * <h2>Problem 4</h2>
 *
 * <p>
 * A palindromic number reads the same both ways.
 * The largest palindrome made from the product of two digit numbers is 9009 = 91 \times 99.
 * </p>
 *
 * <p>
 * Find the largest palindrome made from the product of two three digit numbers
 * </p>
 *
 * @author Alex
 * @since 22-03-2025
 */
public class Problem4 implements ProjectEulerProblem<List<Integer>, List<Integer>> {

    @Override
    public List<Integer> solve(List<Integer> minMax) {
        return findPalindromeProduct(minMax);
    }

    private List<Integer> findPalindromeProduct(List<Integer> minMax) {
        List<Integer> palindromeProducts = new ArrayList<>(Collections.emptyList());
        int min = minMax.get(0);
        int max = minMax.get(1);

        for(int i = min; i <= max; i++) {
            for(int j = min; j <= max; j++) {
                if(isPalindrome(i, j)) {

                    if(!palindromeProducts.isEmpty()) {
                        int first = palindromeProducts.get(0);
                        int sec = palindromeProducts.get(1);

                        if(i * j > first * sec) {
                            palindromeProducts.clear();
                            palindromeProducts.add(i);
                            palindromeProducts.add(j);
                        }
                    }
                    else {
                        palindromeProducts.add(i);
                        palindromeProducts.add(j);
                    }
                }
            }
        }

        System.out.println("\nFound:");
        System.out.println(palindromeProducts);
        return palindromeProducts;
    }

    public static boolean isPalindrome(int a, int b) {
        int result = a * b;
        String resultS = String.valueOf(result);
        if(resultS.length() % 2 != 0) {
            return false;
        }

        String half1 = resultS.substring(0, resultS.length()/2);
        String half2 = resultS.substring(resultS.length()/2);

        StringBuilder reversedHalf2 = new StringBuilder();
        for(int i = half2.length()-1; i >= 0; i--) {
            reversedHalf2.append(half2.charAt(i));
        }

        boolean isPalindrome = half1.contentEquals(reversedHalf2);
        System.out.printf("First half = (%d)%s | Second half = (%d)%s | %b\n", a, half1, b, half2, isPalindrome);
        return isPalindrome;
    }

}

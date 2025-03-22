package com.holmes.projecteuler.problem;

/**
 * <h1><a href="https://projecteuler.net/problem=1">Multiples of 3 or 5</a></h1>
 * <h2>Problem 1</h2>
 *
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 * </p>
 *
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * </p>
 *
 * @author Alex
 * @since 07-01-2024
 */
public class Problem1 implements ProjectEulerProblem<Integer, Integer> {

    @Override
    public Integer solve(Integer question) {
        int sum = 0;

        if (question > 0) {
            for (int i = 0; i < question; i += 1) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
        }

        return sum;
    }
}

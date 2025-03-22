package com.holmes.projecteuler.problem;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1><a href="https://projecteuler.net/problem=3">Largest Prime Factor</a></h1>
 * <h2>Problem 3</h2>
 *
 * <p>
 * The prime factors of 13195 are 5, 7, 13 and 29
 * What is the largest prime factor of the number 600851475143?
 * </p>
 *
 * <h3>What are prime numbers</h3>
 * <p>
 * A Prime Number is: a whole number above 1 that cannot be made by multiplying other whole numbers
 * i.e. 2, 3, 5, 7.
 * </p>
 * <p>The first few prime numbers are: 2, 3, 5, 7, 11, 13, 17, 19 and 23</p>
 * <p>
 * Numbers such as 4, 6, 8, 9 are composite numbers, which you can make by multiplying whole numbers together.
 * i.e. 2*2 = 4, 2*2*2 = 8, 3*3 = 9...
 * </p>
 *
 * <h3>What are prime factors</h3>
 * <p>
 * "Factors" are the numbers you multiply together to get another number:
 * </p>
 *
 * @author Alex
 * @since 22-03-2025
 */
public class Problem3 implements ProjectEulerProblem<List<Integer>, Long> {

    /**
     * @param question
     * @return
     */
    @Override
    public List<Integer> solve(Long question) {
        return findPrimeFactors(question);
    }

    private List<Integer> findPrimeFactors(Long question) {
        List<Integer> primeNumbers = getPrimeNumbers(2000);
        List<Integer> primeFactors = new ArrayList<>();

        long theNumber = question;
        for (int prime : primeNumbers) {
            if (isWhole(theNumber, prime)) {
                primeFactors.add(prime);
                System.out.printf("\nAdded %d,", prime);
                theNumber = division(theNumber, prime).longValueExact();
                System.out.printf("Num to check is now %d,", theNumber);
            }
        }
        System.out.println();

        System.out.printf("Prime factors of %d:\n", question);
        System.out.println(primeFactors);
        return primeFactors;
    }

    public static List<Integer> getPrimeNumbers(int numberOfPrimes) {
        List<Integer> primeNumbers = new ArrayList<>();
        for(int i = 2; primeNumbers.size() < numberOfPrimes; i++) {
            if(isPrimeNumber(i)) {
                primeNumbers.add(i);
            }
        }
        System.out.println("Got following prime numbers:");
        System.out.println(primeNumbers);
        System.out.println("\n");
        return primeNumbers;
    }

    public static boolean isPrimeNumber(int number) {
        for(int i = 2; i <= number/2; i++) {
            if(isWhole(number, i)) {
                return false;
            }
        }
        return true;
    }

    public static BigDecimal division(long a, long b) {
        return BigDecimal.valueOf(a)
                .divide(BigDecimal.valueOf(b), 4, RoundingMode.CEILING);
    }

    public static boolean isWhole(long a, long b) {
        return !division(a, b)
                .stripTrailingZeros()
                .toPlainString()
                .contains(".");
    }
}

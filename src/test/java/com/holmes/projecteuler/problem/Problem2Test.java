package com.holmes.projecteuler.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem2Test {

    public Problem2 problem;

    @BeforeEach
    void setup() {
        problem = new Problem2();
    }

    @Test
    void solve50() {
        Assertions.assertEquals(44, problem.solve(50));
    }

    @Test
    void solve4_000_000() {
        Assertions.assertEquals(4613732, problem.solve(4_000_000));
    }
}
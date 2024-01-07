package com.holmes.projecteuler.problem;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Problem1Test {

    public Problem1 problem;

    @BeforeEach
    void setup() {
        problem = new Problem1();
    }

    @Test
    void solve10() {
        Assertions.assertEquals(23, problem.solve(10));
    }

    @Test
    void solve1000() {
        Assertions.assertEquals(233168, problem.solve(1000));
    }
}
package com.holmes.projecteuler.problem;

public interface ProjectEulerProblem<R, T> {

    R solve(T question);
}

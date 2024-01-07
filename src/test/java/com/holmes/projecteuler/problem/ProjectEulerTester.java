package com.holmes.projecteuler.problem;

import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

/**
 *
 */
@Suite
@SuiteDisplayName("Project Euler Test Suite")
@SelectPackages("com.holmes.projecteuler.problem")
@IncludeClassNamePatterns(".*Test")
class ProjectEulerTester {
    // Intentionally empty
}
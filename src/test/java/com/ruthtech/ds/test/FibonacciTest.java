package com.ruthtech.ds.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.ruthtech.algo.problems.Fibonacci;

public class FibonacciTest {
    private Fibonacci fibonacci;
 

    @Test
    public void testFibonocy() {
        int testIndex = 1;
        int expectedResult = 1;

        assertEquals(expectedResult, Fibonacci.fibinocyRecursion(testIndex));
    }
}
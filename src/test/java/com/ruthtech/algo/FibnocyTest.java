package com.ruthtech.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ruthtech.algo.Fibnocy;

class FibnocyTest {
	
	Fibnocy fib;
	@BeforeEach
	void setUp() throws Exception {
		fib =new Fibnocy();
	}

	@Test
	void testGetNthFibonacciIterate() {
	//	fail("Not yet implemented");
		assertEquals(5,fib.getNthFibonacciIterate(4));
	}

	@Test
	void testGetNthFibonacciRecursive() {
		assertEquals(2,fib.getNthFibonacciRecursive(3));
	}

	@Test
	void testGetNthFibonacciDynamic() {
		assertEquals(2,fib.getNthFibonacciDynamic(3));
	}

}

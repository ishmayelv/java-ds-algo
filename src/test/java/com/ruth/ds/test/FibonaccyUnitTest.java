package com.ruth.ds.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ruth.algo.Fibnocy;

public class FibonaccyUnitTest {
	
    @Test
    public void testFibonaccy() {
    	Fibnocy fib =new Fibnocy();	
    	
		assertEquals(1, fib.getNthFibonacciIterate(1));
		assertEquals(55, fib.getNthFibonacciDynamic(10) );
		assertEquals(89, fib.getNthFibonacciRecursive(11) );
			 
		
    }
}

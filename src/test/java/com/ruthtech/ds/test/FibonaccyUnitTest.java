package com.ruthtech.ds.test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ruthtech.algo.Fibnocy;

public class FibonaccyUnitTest {

    @Test
    public void testFibonaccy() {
    	Fibnocy fib =new Fibnocy();	
    	
		assertEquals(1, fib.getNthFibonacciIterate(1));
		assertEquals(55, fib.getNthFibonacciDynamic(10) );
		assertEquals(89, fib.getNthFibonacciRecursive(11) );
			 
		
    }
}

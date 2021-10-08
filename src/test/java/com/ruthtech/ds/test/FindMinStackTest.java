package com.ruthtech.ds.test;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ruthtech.ds.MinStackProblem;

public class FindMinStackTest {
	
    @Test
    public void testStack() { 
		
		// Find minimum
		MinStackProblem obj =new MinStackProblem();  
		obj.push(2);
		obj.push(3);
		obj.push(1);
			 
		assertEquals(1, obj.getMinimum());
		obj.pop();
		obj.push(7); 
		obj.push(-1); 
		obj.push(8);
		
		assertEquals(-1, obj.getMinimum());
    }
}

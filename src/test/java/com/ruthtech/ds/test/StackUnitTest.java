package com.ruthtech.ds.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.ruthtech.stack.Stack;

public class StackUnitTest {
	
    @Test
    public void testStack() {
		Stack<String> stack =new Stack<String>();  		
		stack.push("1");
		stack.push("2");
		stack.push("3");	
		
		assertEquals("3", stack.pop());
		assertEquals("2", stack.pop());
		assertEquals("1", stack.pop());
		
		stack.push("love");
		stack.push("java");
		
		assertEquals("java", stack.pop());
		
		
		
			
		 
		
    }
}

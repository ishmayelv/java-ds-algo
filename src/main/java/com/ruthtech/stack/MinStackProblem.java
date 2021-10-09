package com.ruthtech.stack;

import com.ruthtech.exception.StackOverFlowException;

/**
 * Build a min stack with T.C O(1) ; space is not a constraint
 * @author ishmayel
 *
 */

public class MinStackProblem {
	
	private Stack<Integer> stack =new Stack<>();
	private Stack<Integer> minStack =new Stack<>();
	
	/**
	 * Find a min number from given input array
	 * @param input
	 */
	public void push(int data)throws StackOverFlowException {
		 int min =data;		
		 if(!minStack.isEmpty()) {
			 if( min>= minStack.peek() )
				 min=minStack.peek();
		 }		 
		 stack.push(data);
		 minStack.push(min); 
	}
	public int pop() {
		minStack.pop();
		return stack.pop();
	}
	
	public int getMinimum() {
		return minStack.peek();
	}
	
	
}

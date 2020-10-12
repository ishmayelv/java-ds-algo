package com.ruth.ds.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ruth.ds.Queue;

public class QueueUnitTest {
	
    @Test
    public void testStack() {
		Queue<String> queue =new Queue<String>();  		
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");	
		
		assertEquals("3", queue.dequeue());
		assertEquals("2", queue.dequeue());
		assertEquals("1", queue.dequeue());
		
		queue.enqueue("love");
		queue.enqueue("java");
		
		assertEquals("java", queue.dequeue());
		
		
		
			
		 
		
    }
}

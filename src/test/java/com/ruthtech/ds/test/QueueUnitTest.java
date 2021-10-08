package com.ruthtech.ds.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.ruthtech.ds.Queue;

public class QueueUnitTest {
	
    @Test
    public void testStack() {
		Queue<String> queue =new Queue<String>();  		
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");	
		
		assertEquals("1", queue.dequeue());
		
		queue.enqueue("test");
		queue.enqueue("java");
		
		assertEquals("2", queue.dequeue());
		assertEquals("3", queue.peek());
			 
		
    }
}

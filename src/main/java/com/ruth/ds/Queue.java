package com.ruth.ds;

import com.ruth.ds.exception.QueueOverFlowException;
import com.ruth.ds.exception.QueueUnderFlowException;
import com.ruth.ds.exception.StackOverFlowException;
import com.ruth.ds.exception.StackUnderFlowException;

/**
 * Applications :
 * 1. Reverse a word
 * 2. Undo operations (Ctrl + Z)
 * 3. Language processing
 * 4. Stack of plates/books
 * 5. Wearing/Removing bangles
 * 6. Recursion, Method calls
 * 7. Back button on browser,
 * 8. Match parenthesis in an expression
 */
public class Queue<E>{
	Node<E> top;	
	Node<E> end;
	int size;
	int MAX_SIZE=100;
	
	public void enqueue(E nodeVal)throws QueueOverFlowException
	{
		 if (size==MAX_SIZE)
			 throw new StackOverFlowException("Stack is full");
		 Node<E> node=new Node<E>(nodeVal);
		 if(top == null) {	
			 top =node;	
		 	 end = node;
		 }
		 else{			
			 node.next= end;
			 end=node;					 
		 }
		 size++;
	}
	public E peek()throws StackUnderFlowException {
		if(size==0)
			throw new StackUnderFlowException("Queue is empty");
		return top.nodeVal;
	}
	
	public E dequeue()throws QueueUnderFlowException{
		if(size==0 || top==null)
			throw new StackUnderFlowException("Queue is empty");		
		
		E element=top.nodeVal;
		top=top.next;
		size--;			 
		return element;
	}
	
	public boolean isEmpty(){
		if(size==0)
			return true;	
		else
			return false;
	} 
	
	private void printQueueElements() {
		Node temp =top;
		while(temp!=null){
		  System.out.print(" "+temp.nodeVal);
		  temp=temp.next;
		}
	} 
	
	private class Node<E> {
		E nodeVal;		
		Node<E> next;		
		Node(E nodeVal ){
			this.nodeVal =nodeVal;
			this.next=null;
		}		
	} 
	
	
	
}
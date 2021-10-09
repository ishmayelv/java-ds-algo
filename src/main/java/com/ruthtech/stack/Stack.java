package com.ruthtech.stack;

import com.ruthtech.exception.StackOverFlowException;
import com.ruthtech.exception.StackUnderFlowException;

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
public class Stack<E>{
	Node<E> top;	
	int size;
	int MAX_SIZE=100;
	
	public void push(E nodeVal)throws StackOverFlowException
	{
		 if (size==MAX_SIZE)
			 throw new StackOverFlowException("Stack is full");
		 Node<E> node=new Node<E>(nodeVal);
		 if(top == null)	
			 top =node;		
		 else{			
			 node.next= top;
			 top=node;		
			 size++;
		 }
		 size++;
	}
	public E peek()throws StackUnderFlowException {
		if(size==0)
			throw new StackUnderFlowException("Stack is empty");
		return top.nodeVal;
	}
	
	public E pop()throws StackUnderFlowException{
		if(size==0)
			throw new StackUnderFlowException("Stack is empty");		
		E str=top.nodeVal;
		top=top.next;
		size--;			 
		return str;
	}
	
	public boolean isEmpty(){
		if(size==0)
			return true;	
		else
			return false;
	} 
	
	private void printStackElements() {
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
	
	
	public void findMinimum() {
		
	}
	
	
}
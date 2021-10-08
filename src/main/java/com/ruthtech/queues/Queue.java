package com.ruthtech.queues;

import com.ruthtech.ds.exception.QueueOverFlowException;
import com.ruthtech.ds.exception.QueueUnderFlowException;

/**
 * 
 * @author ishmayel
 *
 * @param <E>
 */

public class Queue<E>{
	Node<E> top;		
	Node<E> endNode;
	int size;
	int MAX_SIZE=100;
	
	public void enqueue(E nodeVal)throws QueueOverFlowException{
		 if (size==MAX_SIZE)
			 throw new QueueOverFlowException("Queue is full");
		
		 Node<E> node=new Node<E>(nodeVal);
		 if(top == null) {	
			 top = node;	
			 endNode = node;
		 }
		 else{			
			 endNode.next= node;
			 endNode=endNode.next;//which will points to Null				 
		 }
		 size++;
	}
	
	public E peek()throws QueueUnderFlowException {
		if(size==0)
			throw new QueueUnderFlowException("Queue is empty");
		return top.nodeVal;
	}
	
	public E dequeue()throws QueueUnderFlowException{
		if(size==0 || top==null)
			throw new QueueUnderFlowException("Queue is empty");		
		
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
	
	
	private class Node<E> {
		E nodeVal;		
		Node<E> next;		
		Node(E nodeVal ){
			this.nodeVal =nodeVal;
			this.next=null;
		}		
	} 
	
	
	
}
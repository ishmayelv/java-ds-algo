package com.ruthtech.stack;

public class Stack2{
	Node top;
	Node bottom;	
	int length;
	
	private void push(String nodeVal){
		 Node node=new Node(nodeVal);
		 if(top == null) { 
			 top =node;
			 bottom =node;
		 }
		 else{			
			 node.next= top;
			 top=node;		
			 length++;
		 }
		 length++;
	}
	private String peek() {
		return top.nodeVal;
	}
	
	private String pop(){
		String str="";
		 if(top == null) 
			 return str;
		 else{
			 str=top.nodeVal;
			 top=top.next;
			 length--;			 
		 }
		 return str;
	}
	
	private void printLinkedList() {
		Node temp =top;
		while(temp!=null){
		  System.out.print(" "+temp.nodeVal);
		  temp=temp.next;
		}
	}
	
	class Node{
		String nodeVal;		
		Node next;		
		Node(String nodeVal ){
			this.nodeVal =nodeVal;
			this.next=null;
		}		
	}
	
	public static void main(String[] args) {
		Stack2 ll =new Stack2();  		
		ll.push("1");
		ll.push("2");
		ll.push("3");	
		
		System.out.println(ll.pop());
		System.out.println(ll.peek());
		System.out.println(ll.pop());
		System.out.println(ll.pop());
		System.out.println(ll.pop()); 
	}
	
}

package com.ruthtech.linkedlist;

 
public class SingleLinkedList {

	
	Node head;
	Node tail;	
	int length;
	
	private void addNode(String nodeVal){
		 Node node=new Node(nodeVal);
		 if(head == null) { 
			 head =node;
			 tail =node;
		 }
		 else{			
			  tail.next=node;
			  tail=tail.next;
		 }
		 length++;
	}
	
	private void addNodeAtFirst(String nodeVal) {		
		 Node node=new Node(nodeVal);		 
		 node.next= head;
		 head=node;		
		 length++;
	}
	private void addNodeAtLast(String nodeVal) {		
		 Node node=new Node(nodeVal);		 
		 tail.next=node;
		 tail=tail.next;	
		 length++;
	}
	
	private void printLinkedList() {
		Node temp =head;
		while(temp!=null)
		{
		  System.out.print(" "+temp.nodeVal);
		  temp=temp.next;
		}
		
	
	}
	private void printLLLength() {
		System.out.println();
		System.out.println("Linked List Length:"+length);
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
		SingleLinkedList ll =new SingleLinkedList();  		
		ll.addNode("1");
		ll.addNode("2");
		ll.addNode("3");	
		ll.addNodeAtFirst("0");
		ll.addNodeAtLast("4");
		ll.printLinkedList();
		 
		ll.printLLLength();
		 
	}
	
}

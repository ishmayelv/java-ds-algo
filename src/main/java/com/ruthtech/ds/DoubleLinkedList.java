package com.ruthtech.ds;

 
public class DoubleLinkedList {
	Node head;
	Node tail;

	int length;
	
	private void addNode(String nodeVal){
		 Node node=new Node(nodeVal,tail);
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
		 head.previous=node;
				 
		 head=node;
		 
		 length++;
	}
	private void addNodeAtLast(String nodeVal) {		
		 Node node=new Node(nodeVal,tail);		 
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
	
	private void printDLReverse() {
		Node temp =tail;
		while(temp!=null)
		{
		  System.out.print(" "+temp.nodeVal);
		  temp=temp.previous;
		}
	}
	
	private void printLLLength() {
		System.out.println();
		System.out.println("Linked List Length:"+length);
	}
	 
	
	
	class Node{
		String nodeVal;		
		Node next;	
		Node previous;
		Node(String nodeVal ){
			this.nodeVal=nodeVal;
			this.next	=null;
			this.previous=null;
		}	
		Node(String nodeVal,Node node ){
			this.nodeVal=nodeVal;
			this.previous=node;
			this.next	=null;
		}	
	}
	
	public static void main(String[] args) {
		DoubleLinkedList ll =new DoubleLinkedList();  		
		ll.addNode("1");
		ll.addNode("2");
		ll.addNode("3");	
		ll.addNodeAtFirst("0");
		ll.addNodeAtLast("4");
		ll.printLinkedList();
		 
		ll.printLLLength();
		System.out.println("Before calling DL print ");
		ll.printDLReverse();
	}
	
}

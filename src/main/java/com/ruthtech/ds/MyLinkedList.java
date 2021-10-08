package com.ruthtech.ds;


public class MyLinkedList {
	class Node{
		int data;
		Node next;		
		public Node(int data){
			this.data=data;
		} 
	}
	
	Node head=null;
	Node tail=null;
	int length;
	
	public void addNode(int val){
		if(head==null){
			Node node = new Node(val);
			head = node;
			tail = node;
		}else{
			tail.next = new Node(val);
			tail = tail.next;
		}
		this.length++;
	}
	public int getLength() {
		return this.length;
	}
	
	public void printLinkedList(){
		System.out.println();
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}		
	}
	
	public void addNodeAtStart(int val){		 
		Node newNode = new Node(val);
		newNode.next=head;		
		head =newNode;		 
		this.length++;
	}
	
	//It always removes last node
	public void removeNode(){
		Node curNode = head;
		while(curNode.next!=null && curNode.next.next!=null ){			
			curNode = curNode.next;
		}	
		tail=curNode;
		tail.next=null;
	}
	
	//It always removes node at start position
	public void removeNodeAtStart(){		 
		head=head.next;			 
	}
		
	
	
	
	/* Why linked List:
	 * 1. Insert the Node any where
	 * 2.  prepend O(1), APPEND O(1), lookup O(n), delete O(n)
	 */
	public static void main(String[] args) {
		
		MyLinkedList listImpl =new  MyLinkedList();
		listImpl.addNode(10);
		listImpl.addNode(20);
		listImpl.addNode(30);
		listImpl.addNode(40);
		listImpl.printLinkedList();
		listImpl.addNodeAtStart(50);
		listImpl.printLinkedList();
		listImpl.removeNode();
		listImpl.printLinkedList();
		listImpl.removeNodeAtStart();
		listImpl.printLinkedList();
		//listImpl.removeNodeAtCertainIndex(3);
		//listImpl.printLinkedList();
	} 
    
	
	
	
	
	
}


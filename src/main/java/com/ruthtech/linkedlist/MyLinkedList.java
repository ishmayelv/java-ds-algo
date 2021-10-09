package com.ruthtech.linkedlist;


public class MyLinkedList<E> {
		
	Node<E> head=null;
	Node<E> tail=null;
	int length;
	
	/*MyLinkedList(E ele){
		Node<E> node = new Node<E>(ele);
		this.head = node;
		this.tail = node;
		this.length++;
	}*/
	
	public void addNode(E val){
		if(head==null) {
			Node<E> node = new Node<E>(val);
			this.head = node;
			this.tail = node; 
		}
		else {
			tail.next = new Node<E>(val);
			tail = tail.next;
		}
		this.length++;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public void printLinkedList(){
		System.out.println();
		Node<E> temp = head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}		
	}
	
	public void addNodeAtStart(E val){		 
		Node<E> newNode = new Node<E>(val);
		newNode.next=head;		
		head =newNode;		 
		this.length++;
	}
	
	//It always removes last node
	public void removeNode(){
		Node<E> curNode = head;
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
		
		MyLinkedList<Integer> listImpl =new  MyLinkedList<Integer>();
		
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
    
	
	private class Node<T>{
		T data;
		Node<E> next;		
		public Node(T data){
			this.data=data;
		} 
	}
	
	
	
	
}


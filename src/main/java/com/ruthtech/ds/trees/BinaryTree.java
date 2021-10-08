package com.ruthtech.ds.trees;

/**
 * 
 * @author ishmayel
 * 
 */
public class BinaryTree {
	private Node root;
	
	public void insert(Integer element) {
		if(root==null) {
			root = new Node(element);
		}
		else {
			Node newNode = new Node(element);
			addNode(root,element, newNode);			
		}
	}	
	private void addNode(Node curNode, Integer element, Node newNode) {		
		if(element <= curNode.getElement()) {
			 if(curNode.getLeftNode()==null)
				 curNode.setLeftNode(newNode);
			 else
				 addNode(curNode.getLeftNode(), element,newNode);
		 }
		 else{
			 if(curNode.getRightNode()==null)
				 curNode.setRightNode(newNode);
			 else
				 addNode(curNode.getRightNode(), element,newNode);
		 } 
	}
	/**
	 * 
	 * @param currentNode
	 */
	public void inOrdertraversal(Node currentNode) {
		if(currentNode ==null)
			return;		
		traverseBinaryTree(currentNode.getLeftNode());
		System.out.print(currentNode.getElement()+" ");
		traverseBinaryTree(currentNode.getRightNode());
		 
	}
	public void traverseBinaryTree(Node currentNode) {
		if(currentNode ==null)
			return;
		System.out.print(currentNode.getElement()+" ");
		traverseBinaryTree(currentNode.getLeftNode());
		traverseBinaryTree(currentNode.getRightNode());		 
	}
	public void postOrdertraversal(Node currentNode) {
		if(currentNode ==null)
			return;		
		traverseBinaryTree(currentNode.getLeftNode());
		traverseBinaryTree(currentNode.getRightNode());		
		System.out.print(currentNode.getElement()+" ");
	}
	
	/**
	 * Search for an element in a Binary Tree, 
	 * @param element - Searching element
	 * @param currNode - initially have to pass root node 
	 * @return true if element found else false
	 */
	public Node searchElement(Integer element, Node currNode) {
		Node node=null;
		if(currNode==null)
			node=null;
		else if(element==currNode.getElement())
			node=currNode;
		else if(element<currNode.getElement())
			node=searchElement(element,currNode.getLeftNode());
		else 
			node=searchElement(element,currNode.getRightNode());
		
		return node;
	}
	
	/**
	 * Find a minimum element in a Binary Tree, 
	 * assuming tree is a balanced binary tree
	 * @param currNode - initially have to pass root node 
	 * @return minimum element in a binary tree
	 */
	public Integer findMinElementInBinaryTree( Node currNode) {
		Integer element=0;
		if(currNode!=null && currNode.getLeftNode()==null)
			element=currNode.getElement();
		else if(currNode.getLeftNode()!=null)
			element=findMinElementInBinaryTree(currNode.getLeftNode());		
		return element;
	}
	
	public static void main(String... args) {
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(8);
		bt.insert(20);
		bt.insert(15);
		bt.insert(21);
		bt.insert(5);
		bt.insert(9);
		
		System.out.println("inOrdertraversal ");
		bt.inOrdertraversal(bt.root);
		System.out.println("\ntraverseBinaryTree");
		bt.traverseBinaryTree(bt.root);
		System.out.println("\npostOrdertraversal");
		bt.postOrdertraversal(bt.root);
		System.out.println("");
		System.out.println("elelement 8:"+ ( (bt.searchElement(8, bt.root)==null)? "element Not Found":"element found") );
		System.out.println("elelement 21:"+( (bt.searchElement(21, bt.root)==null)? "element Not Found":"element found") );
		System.out.println("elelement 231:"+( (bt.searchElement(231, bt.root)==null)? "element Not Found":"element found") );
		
		
		System.out.println("Minimum Element in a tree:"+ bt.findMinElementInBinaryTree( bt.root) );
	}
		

	private class Node{
		private Integer element;
		private Node leftNode;
		private Node rightNode;
	
		private Node(Integer element) {
			this.element=element;
			this.leftNode=null;
			this.rightNode=null;
		}

		public Integer getElement() {
			return element;
		}

		public Node getLeftNode() {
			return leftNode;
		}
		public void setLeftNode(Node leftNode) {
			this.leftNode = leftNode;
		}

		public Node getRightNode() {
			return rightNode;
		}
		
		public void setRightNode(Node rightNode) {
			this.rightNode = rightNode;
		}

	}
	
}


package com.ruth.ds.trees;

/**
 * 
 * @author ishma
 *
 */
public class BinaryTree {
	public DoubleLinkedList root;
	
	private void insert(Integer element) {
		if(root==null) {
			root = new DoubleLinkedList(element);
		}
		else {
			DoubleLinkedList newNode = new DoubleLinkedList(element);
			addNode(root,element, newNode);			
		}
	}
	
	private void addNode(DoubleLinkedList curNode, Integer element, DoubleLinkedList newNode) {		
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
	
	public void traverseBinaryTree(DoubleLinkedList currentNode) {
		if(currentNode ==null)
			return;
		System.out.print(currentNode.getElement()+" ");
		traverseBinaryTree(currentNode.getLeftNode());
		traverseBinaryTree(currentNode.getRightNode());
		 
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
		
		bt.traverseBinaryTree(bt.root);
		
	}
		

	private class DoubleLinkedList{
		private Integer element;
		private DoubleLinkedList leftNode;
		private DoubleLinkedList rightNode;
		
	
		private DoubleLinkedList(Integer element) {
			this.element=element;
			this.leftNode=null;
			this.rightNode=null;
		}


		public Integer getElement() {
			return element;
		}

		public DoubleLinkedList getLeftNode() {
			return leftNode;
		}


		public void setLeftNode(DoubleLinkedList leftNode) {
			this.leftNode = leftNode;
		}


		public DoubleLinkedList getRightNode() {
			return rightNode;
		}


		public void setRightNode(DoubleLinkedList rightNode) {
			this.rightNode = rightNode;
		}

	}
	
}


package com.ruthtech.ds.trees;
public class BinarySearchTree{	
	class Node{
		int nodeValue;		
		Node left;
		Node right;		
		Node(int nodeValue ){
			this.nodeValue =nodeValue;
			this.left=null;
			this.right=null;
		}		
	}

	Node root;
	int height;
	
	private void insert1(int nodeVal){
		 Node newNode=new Node(nodeVal);		 
		 if(this.root == null)
			 this.root = newNode;
		 else{
			 Node currentNode=root;
			 boolean nodeNotAdded=true;
			 do{ 
				if(nodeVal<=currentNode.nodeValue) {
					 if(currentNode.left!=null)
						 currentNode=currentNode.left;
					 else{
						 currentNode.left=newNode;
						 nodeNotAdded=false;
					 }
				 }
				 else {
					 if(currentNode.right!=null)
						 currentNode=currentNode.right;
					 else{
						 currentNode.right=newNode;	
						 nodeNotAdded=false;
					 }
				 }
			 }while(nodeNotAdded);
		}
	}
	 
	public void insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        }
        else {
            Node current = this.root;
            while (true) {
                // right
                if (current.nodeValue < value) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = newNode;
                        break;
                    }
                    // left
                } else {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = newNode;
                        break;
                    }
                }
            }
        }//main else
    }
	
	
	private boolean searchNode(int iValue) {
		 if(root !=null && root.nodeValue == iValue) 
			 return true;
		 else if(iValue<=root.nodeValue)
			 return findNode(iValue, root.left);
		 else 
			 return findNode(iValue, root.right);		
	}
	private boolean findNode( int iValue, Node currentNode) {
		if(currentNode == null) {
			System.out.println("problem with search");
			return false;
		}
		if( iValue == currentNode.nodeValue)
			return true;
		else if( iValue < currentNode.nodeValue)
			return findNode(iValue ,currentNode.left);
		else 
			return findNode(iValue ,currentNode.right);
	}
	
	/*
	private void addRightLeaf(int nodeVal, Node newNode, Node rightNode) {
		if(rightNode==null)
			rightNode=newNode;
		else if(nodeVal <=rightNode.nodeValue)
			addLeftLeaf(nodeVal,newNode ,rightNode.left);
		else
			addRightLeaf(nodeVal,newNode ,rightNode.right);
	}*/
		
	public static void main(String[] args) {
		BinarySearchTree bst =new BinarySearchTree();  
		bst.insert1(9);
		bst.insert1(4);
		bst.insert1(20);
		bst.insert(1);
		bst.insert(6);
		bst.insert(15);
		bst.insert(30);	
		
		System.out.println("bst --"+bst.root);
		System.out.println("9 ?"+bst.searchNode(9));
		System.out.println("20 ?"+bst.searchNode(20));	System.out.println("30 ?"+bst.searchNode(30));
	}
	
}

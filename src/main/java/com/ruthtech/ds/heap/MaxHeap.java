package com.ruthtech.ds.heap;

import com.ruthtech.ds.exception.HeapUnderFlowException;

/**
 * 
 * @author ishmayel
 * Parent node : Arr[(i -1) / 2]
 * Left child node  : Arr[(2 * i) + 1] 
 * Right child node : Arr[(2 * i) + 2]
 *  
 * public  operations: Insert, extractMin (Remove min - heapify), getMin, 
 * private operations: swap, heapfy, leftChild, rightChild, isLeaf
 * 
 * T.C - insertion : O(log n)
 * T.C - access highPriorityMinHeap - O(1)
 * T.C - remove : O(log n)
 * 
 */
public class MaxHeap{	
	
	/**
	 * insert(): Inserting a new key takes O(Log n) time. 
	 * We add a new key at the end of the tree. If new key is larger than its parent, then we don’t need to do anything. 
	 * Otherwise, we need to traverse up to fix the violated heap property.
	 */
	int heap[];
	int MAX_HEAP =0;
	int count =0;
	
	private MaxHeap(int size) {
		this.MAX_HEAP=size;
		heap=new int[size];
	}		 
	private void siftup(int current) {
		int parent = getParent(current);
		if(parent==-1) return;
		if( heap[current] > heap[parent]) {
			swap(current,parent);
			siftup(parent);
		}	 
	}
	
	private void siftDown(int currentPosition ) {
		int targetPosition=-1;	 
		int leftChild =getLeftChild(currentPosition);
		int rightChild =getRightChild(currentPosition);
		
		if( leftChild!=-1 && rightChild!=-1) {
			if(heap[leftChild] > heap[rightChild])
				targetPosition=leftChild;
			else
				targetPosition=rightChild;
		}
		else if(leftChild==-1)  
			targetPosition=rightChild;	 
		else
			targetPosition=leftChild;
		
		if(targetPosition==-1)
			return;
		
		
		if( heap[currentPosition] < heap[targetPosition]){  		
			swap(currentPosition,targetPosition); 
			siftDown(targetPosition);
		}
		
		
	}
	
	private void swap(int sourcePos, int targetPos) {
		if(sourcePos==-1 || targetPos==-1 || targetPos>=MAX_HEAP || sourcePos>=MAX_HEAP)
			return;		
		int tempValue = heap[targetPos];
		heap[targetPos]=heap[sourcePos];
		heap[sourcePos]=tempValue;
	}
	
	private int getMinHeap() {
	  if(count>0)
		  return heap[0];
	  else
		  return -1;
	  
	}
	public int remove() {
		int minElemment=-1;		
		if(count<1)
			throw new HeapUnderFlowException("");
		
		minElemment=heap[0];
	    heap[0]=heap[count-1];
	    heap[count-1]=0;
	    count--;
		if(count>1) {
			siftDown(0);
		} 
		return minElemment; 
	}
	
	/**
	 * Find the elements right position: shit down/shiftup
	 * @param element
	 */
	
	public void insert(int element){
		if(count>=MAX_HEAP)
			return;
		heap[count]=element;
		siftup(count);	
		count++; 
	}
	
	
	/**
	 * Get the left child of parent at position passed
	 */
	private int getLeftChild(int position) {
		int leftChild = (2*position)+1 ;
		if (leftChild>=count)
			return -1;
					
		return leftChild ;
	}
	
	/**
	 * Get the right child of parent at position passed
	 */
	private int getRightChild(int position){
		int rightChild = (2*position)+2;
		if (rightChild>=count)
			return -1;		
		return rightChild;
	}
	
	/**
	 * Get the parent position for position of child passed
	 */
	private int getParent(int position){
		if(position<0 || position>count )
			return -1;
		return (position-1)/2 ;
	}
	
	private void print(){
		 for(int i = 0; i < count / 2; i++) { 
	          System.out.print(" PARENT : " + heap[i] 
	                          + " LEFT CHILD : " + heap[(2 * i)+1] 
	                          + " RIGHT CHILD :" + heap[(2 * i) + 2]); 
	          System.out.println();
	     } 		 
	}
	
	public static void main(String args[]) {
		MaxHeap minHeap= new MaxHeap(40);
		 	minHeap.insert(5); 
	        minHeap.insert(3); 
	        minHeap.insert(17); 
	        minHeap.insert(10); 
	        minHeap.insert(84); 
	        minHeap.insert(19); 
	        minHeap.insert(6); 
	        minHeap.insert(22); 
	        minHeap.insert(9); 	 
	        
	        minHeap.print();  
	        System.out.println("<===============================>" + minHeap.remove()); 
	        minHeap.print();  
	}
	
	
}

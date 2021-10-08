package com.ruthtech.sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr[] = { 38,4,27,43,9,82,10,3};
		System.out.println("Given Array"); 
		printArray(arr); 		
		
		 quickSort(arr, 0, arr.length-1);
		
		//printArray(arr); 

	}
	
	private static void quickSort(int inArray[], int lIndex, int rIndex) {
		
		if (lIndex >= rIndex ) return;		
		
		int pivot = inArray[(lIndex + rIndex)/2];
		
		int index = splitArray(inArray, lIndex, rIndex, pivot);
		
		quickSort(inArray,lIndex, index-1);
		quickSort(inArray,index, rIndex);
		
		System.out.println("int quickSort ");
		//printArray(inArray);
		
	}
	
	private static int splitArray(int []inArray, int lIndex, int rIndex, int pivot) {
		System.out.println("splitArray pivot "+pivot );
		while(lIndex<= rIndex) {			
			while (inArray[lIndex] < pivot) {
				lIndex ++;
			}
			while (inArray[rIndex] > pivot) {
				rIndex --;
			}
			if(lIndex <= rIndex) {
				 //swap
				int temp= inArray[lIndex];
				inArray[lIndex]= inArray[rIndex];
				inArray[rIndex]= temp;
				
				lIndex++;
				rIndex--;
			}
		}		
		printArray(inArray);
		return lIndex;
	}
	static void printArray(int arr[]){ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	}	
}

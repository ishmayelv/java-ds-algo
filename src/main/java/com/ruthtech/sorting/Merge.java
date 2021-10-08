package com.ruthtech.sorting;

public class Merge {	
	static void printArray(int arr[]){ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	}	
	 
	private  void merge(int []inArray, int []leftArray, int []rightArray) {		
		System.out.println("merge -> ");
		printArray( leftArray); printArray(rightArray);
		
		int i=0,j=0,k=0;
		
		while( i<leftArray.length  && j<rightArray.length){			
			if(leftArray[i] <=  rightArray[j])
				inArray[k++] = leftArray[i++];
			else
				inArray[k++] = rightArray[j++];			
		}		
		while(i<leftArray.length) {
			inArray[k++] = leftArray[i++];
		}		
		while(j<rightArray.length) {
			inArray[k++] = rightArray[j++];	
		} 		
	}
	 
	
	private  void mergeSort(int []inArray, int n) {
		if(n<2)
			return;
		 
		int mid = n/2;
		
		int []leftArray = new int[mid];
		int []rightArray = new int[n-mid];
		
		for(int i=0;i<mid ;i++)
			leftArray[i]=inArray[i];
		
		for(int j=mid; j<n; j++)
			rightArray[j-mid]=inArray[j];
		
		mergeSort(leftArray, mid);
		mergeSort(rightArray, (n-mid));		
		merge(inArray, leftArray,rightArray);
	}
	
	

	// Driver method 
	public static void main(String args[]) 
	{ 
		//int arr[] = { 12, 11, 13, 5, 6, 7 }; 
		int arr[] = { 38,4,27,43,9,82,10,3};
		System.out.println("Given Array"); 
		printArray(arr); 
		Merge obj=new Merge();
		obj.mergeSort(arr , arr.length); 
		System.out.println("\nSorted array"); 
		printArray(arr); 
	}

}

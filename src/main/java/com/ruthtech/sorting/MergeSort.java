package com.ruthtech.sorting;
/* Java program for Merge Sort */
public class MergeSort { 
	
	/** Merges two sub arrays of arr[]. 
	 *  First sub array is arr[l..m] 
	 *  Second sub array is arr[m+1..r] 
	 */
	void merge(int[] iArray, int[] lArray, int[] rArray, int leftArrayLength, int rightArrayLength){
		
		System.out.println("merge -> ");
		printArray( lArray); printArray(rArray);
		
		int i = 0, j = 0, k = 0;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (lArray[i] <= rArray[j])
            	iArray[k++] = lArray[i++];
            else
            	iArray[k++] = rArray[j++];
        } 
		
        while (i < leftArrayLength)
        	iArray[k++] = lArray[i++];
        
        while (j < rightArrayLength)
        	iArray[k++] = rArray[j++];
	 }	

	// Main function that sorts arr[l..r] using  merge() 
	void mergeSort(int iArray[], int arrayLength) { 
		if (arrayLength < 2)
            return;
        
		int mid = arrayLength / 2;
        int[] lArray = new int[mid];
        int[] rArray = new int[arrayLength - mid];

        for (int i = 0; i < mid; i++) {
        	lArray[i] = iArray[i];
        }
        for (int i = mid; i < arrayLength; i++) {
        	rArray[i - mid] = iArray[i];
        }
        
        mergeSort(lArray, mid);
        mergeSort(rArray, arrayLength - mid);
        
        merge(iArray, lArray, rArray, lArray.length, rArray.length);
        
       //merge(iArray, lArray, rArray, mid, arrayLength- mid);
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]){ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 
		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		//int arr[] = { 12, 11, 13, 5, 6, 7 }; 
		int arr[] = { 38,3,27,43,9,82,10,3}; 
		System.out.println("Given Array"); 
		printArray(arr); 
		MergeSort ob = new MergeSort(); 
		
		ob.mergeSort(arr, arr.length); 
		System.out.println("\nSorted array"); 
		printArray(arr); 
	}
	
} 





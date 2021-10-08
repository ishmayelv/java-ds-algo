package com.ruthtech.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {6,2,3,1,8,7,5,4};		
		print(input);
		print(insertionSort(input));		
	}
	 
	/* Function to sort an array using insertion sort*/
	private static int[] insertionSort(int arr[])  
	{  
	    int i, key, j;  
	    for (i = 1; i < arr.length; i++){  
	        key = arr[i];  
	        j = i - 1;  
	  
	        /* Move elements of arr[0..i-1], that are  
	        greater than key, to one position ahead  
	        of their current position */
	        while (j >= 0 && arr[j] > key){  
	            arr[j + 1] = arr[j];  
	            j--;  
	        }  
	        arr[j + 1] = key;  
	    }  
	    return arr;
	}  
	
	
	private static int[] fnInsertionSort(int input[]){		 
		if (input==null || input.length<2)
			return input;
		else{ 
			int  temp=0, key=0, keyIndex=0;
			
			for(int i=1; i<input.length;i++) {
				key=input[i] ;				
				keyIndex=i;						
				for(int j=i; j>0 ;j--){					
					if(input[j-1] > input[keyIndex] ) 
						temp=input[keyIndex];
						input[keyIndex]=input[j-1];
						input[j-1]=temp ;
						keyIndex=j;
				}				
			}			
			return input; 
		} 
	}
	
	private static void print(int input[]) {
		for(int i:input) 
			System.out.print(" "+i);
		System.out.println();
	}
	
	
}

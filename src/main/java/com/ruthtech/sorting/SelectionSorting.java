package com.ruthtech.sorting;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {5,6,3,1,8,7,2,4};		
		//print(input);
		print(fnSelectionSort(input));	
	}
	private static void print(int input[]) {
		for(int i:input) 
			System.out.print(" "+i);
		System.out.println();
	}
	
	private static int[] fnSelectionSort(int input[]){		 
		if (input==null || input.length<2)
			return input;
		else{ 
			int  temp=0, smallIndex=0;
			for(int i=0; i<input.length;i++) {
				smallIndex=i ;				
				for(int j=i; j<input.length-1;j++){					
					if(input[j] < input[smallIndex]) 
						smallIndex=j;
				}		 
				if(i < smallIndex) {
					temp=input[smallIndex];
					input[smallIndex]=input[i];
					input[i]=temp;
				}				
			}			
			return input; 
		} 
	}
	
	//Very few variables used here
	public int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallest = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
        return array;
    }

	
	
	
}

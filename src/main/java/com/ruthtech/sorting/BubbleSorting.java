package com.ruthtech.sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {5,6,3,1,8,7,2,4};
		
		print(input);
		print(fnBubbleSort(input));
		
	}
	private static void print(int input[]) {
		for(int i:input) 
			System.out.print(" "+i);
		System.out.println();
	}
	
	private static int[] fnBubbleSort(int input[]) {
		int temp=0;
		if (input==null || input.length<2)
			return input;
		else{
			for(int i=0; i<input.length;i++) {
				for(int j=0; j<input.length-1;j++){					
					if(input[j]> input[j+1]) {
					  temp = input[j];
					  input[j] =input[j+1];
					  input[j+1]=temp;
					} 
				}			
			}			
			return input; 
		} 
	}

}

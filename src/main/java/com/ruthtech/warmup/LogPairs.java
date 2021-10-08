package com.ruthtech.warmup;

public class LogPairs {
	//Log all pairs of arry
	public static void main(String[] args) {
	 int []intArray = {2,3,4};
	 //out put => 
	 /* 1,1; 1,2;..;1,7;..7,7..7,6 */
	 //printPairs(intArray);
	 
	 printAllThenSumPairs(intArray);
	}
	
	public static void printPairs(int []input) {
		
		/*for(int i=0,j=0;(i< input.length && j<input.length);j++) {
			System.out.println(input[i]+","+input[j]);			
			
			if(j==input.length)
				  i++; j=0;
		}*/
		
		for(int i=0;i< input.length ;i++)
			for(int j=0;j< input.length ;j++)			
				System.out.println(input[i]+","+input[j]);		
		// O(n)*O(n)=> O(n^2)	Bad performance 
	}
	
	public static void printAllThenSumPairs(int []input) {
		for(int i=0;i< input.length ;i++)
			System.out.print(input[i]+" ");	 
		
		System.out.println();	
		for(int i=0;i< input.length ;i++)
			for(int j=0;j< input.length ;j++)			
				System.out.println(input[i]+input[j]);	 
	}
}

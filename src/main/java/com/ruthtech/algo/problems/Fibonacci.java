package com.ruthtech.algo.problems;

public class Fibonacci {
	
	// Fibinocy Number : 1,1,2,3,5,13,21,34, 55, 89, 144 ...etc
	  
	public static int fibinocyRecursion(int number){		 
		if(number==1)
			 return 1;	
		if(number==2)
			 return 2;	
		
		 return  fibinocyRecursion(number-1)+fibinocyRecursion(number-2);
	}
	
	private static void printFibinocyNavy(int number) {	  
		int i=0, j=1;
		int fibinocyNum=0;				
		while((i+j)<number) {
			fibinocyNum=i+j;
			i=j;
			j=fibinocyNum;
			System.out.print(fibinocyNum+" "); 
		}
		 
	 
	}
	
	
	public static void main(String[] args) {
		printFibinocyNavy(100);
		 System.out.println();
		 System.out.println("Fibinocy number ::"+fibinocyRecursion(1));
		 
		 boolean test= (false && false || false || !false);
		 System.out.println("test --> "+test);
		 
		 
		 boolean test2=( (true) && (true && false && true ));
		 System.out.println("test2 --> "+test2);
	}
    
	
}

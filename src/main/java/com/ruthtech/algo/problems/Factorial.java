package com.ruthtech.algo.problems;

public class Factorial {

	// 5! = 5*4*
	 
	private static int factorialRecursion(int number) {
		int fact=1;		 
		for(int i=number; i>1; i--) 
			fact = fact*i;		
		 
		return fact;
	}
	 
	public static void main(String[] args) { 
		System.out.println("factorial 5 ?"+factorialRecursion(5));
		System.out.println("factorial 3 ?"+factorialRecursion(3));		
	}
    
	
}

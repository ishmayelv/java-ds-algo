package com.ruth.algo;

/**
 * @author ishmayel
 * Implement Fibonacci serries in Dynamic/ iterative / recursive approaches
 * 
 *  FS-> 0,1,1,2,3,5,8, 13, 21
 *  f[n] = f[n-1] + f[n-2]
 *  
 *  expecting n must be >=0 , 
 */
public class Fibnocy { 
	
	// expecting n must be >=0 , 
	public int getNthFibonacciIterate(int n){ 
		int num1=0;
		int num2=1;
		int fib=0; 
		
		for(int i=0 ; i<n ; i++) {
			fib =num1+num2;
			num1=num2;
			num2=fib;
		} 
		return fib;
	} 
	public int getNthFibonacciRecursive(int n) {	 	
		if(n<=1)
			return n;		
		else 
		  return getNthFibonacciRecursive(n-1)+getNthFibonacciRecursive(n-2);
	}
	
	
	/** n=3=2
	 * DP
	 * @param n
	 * @return nth fibonaccy
	 */
	public int getNthFibonacciDynamic(int n) {  
		int fibArray[]=new int[n+2];
		fibArray[0]=0;
		fibArray[1]=1; 
		for(int i=2 ; i<=n ; i++) {
			fibArray[i] = fibArray[i-1] +fibArray[i-2];
		} 
		return fibArray[n];
	} 
	
	
	
}

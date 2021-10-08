package com.ruthtech.algo;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static boolean  isPrimeNumber(int inElement) throws Exception{
		int count=0;
		if(inElement<0)
			throw new Exception("Devided By Zero error");
		
		for(int i=1; i<=inElement; i++) {
			int r =inElement%i;
			System.out.println(r+","+i);
			if( r == 0)
				count ++; 
		}
		System.out.println("count:"+count);
		
		if(count!=2)
			return false;
		else 
			return true;
	}

}

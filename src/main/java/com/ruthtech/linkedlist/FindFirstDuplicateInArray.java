package com.ruthtech.linkedlist;
import java.util.Hashtable;

public class FindFirstDuplicateInArray {
	public static void main(String[] args) {
		Integer ipArray1[]= {1,1,3,9};		
		Integer ipArray2[]= {2,5,5,2,3,5,1,2,4};
		//sum -> 8
		int sum=8;		
		System.out.println("Input1 :"+findFirstRepeatedElement(ipArray2)); 
	}
	
	//this wil return O(1)
	private static int findFirstRepeatedElement(Integer []pIntArray) {
		Hashtable<Integer,Integer> hTable = new Hashtable<Integer,Integer>();
		for(Integer i: pIntArray) {
			if(hTable.contains(i)) 
				return hTable.get(i);
			else
				hTable.put(i,i);
		}
		return  0;
	}
	
	
	
}



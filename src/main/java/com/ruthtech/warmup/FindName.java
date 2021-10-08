package com.ruthtech.warmup;

public class FindName {

	public static void main(String[] args) {
		 
		String names[] =new String[1];
		names[0]="test";
		//String[] strArray2 = {"A","B","C"}; 

		
		findName(names);
	}
	
	public static void findName(String []names) {
		
		for(String name:names) {
			if(name.equals("test"))
			System.out.println("FOUND NAME");
		}
	}
}

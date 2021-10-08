package com.ruthtech.strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("vemuru :"+reverse("vemuru"));
	}
	private static String reverse(String inPut) {
		
		char []charArray= inPut.toCharArray();
		String newStr="";
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=charArray.length-1, j=0; i>=0; i--,j++) 			
			newStr=newStr+charArray[i];
			 
			
		for(int i=charArray.length-1; i>=0; i--) 			
			sb.append(charArray[i]);
		
		return sb.toString();
	 
	}
}

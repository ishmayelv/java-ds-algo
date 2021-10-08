package com.ruthtech.arrayproblems;
import java.util.*;
public class RecerseStringSpecialChars {
	 
			
	private List<String> specialChars=	List.of("!","@","^");
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="!ih@ih^";
		RecerseStringSpecialChars rsObj =new RecerseStringSpecialChars();
		 System.out.println("output ::"+rsObj. reverseStr(str));
	}
	
	public  String reverseStr(String input) {
		String out="";
		if(input == null || input.length()<2 )
			out= input ;
		else if(	specialChars.contains(input.substring(input.length()-1))	
				) { 
			out=  reverseStr(input.substring(0,input.length()-1)) + input.charAt(input.length()-1) ;
		}
		else
			out= input.charAt(input.length()-1)+reverseStr(input.substring(0,input.length()-1)) ;
		
		System.out.println("out:: "+out);
		
		return out;
	}

}

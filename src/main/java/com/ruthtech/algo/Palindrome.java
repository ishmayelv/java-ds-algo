package com.ruthtech.algo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Java program to show you how to check if a String is palindrome or not. *
 * An String is said to be palindrome if it is equal to itself after reversing.
 * In this program, you will learn how to check 
 * if a string is a palindrome
 * in java using recursion and stack
 */

public class Palindrome {
	public static void main(String args[]) { 
		Scanner reader = new Scanner(System.in); System.out.println("Please enter a String"); 
		String input = reader.nextLine();
		System.out.printf("Is %s a palindrome? : %b %n", input, isPalindromStack(input)); 
	}

	/**
	 * * Java method to check if given String is Palindrome * @param text * @return
	 * true if text is palindrome, otherwise false
	 */
	public static boolean isPalindromString(String text) {
		String reverse = reverse(text);
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}

	/**
	 * Java method to reverse String using recursion 
	 * @param input 
	 * @return 
	 * reversed String of input
	 */
	
	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1)); 
	}
	
	 
	public static String reverseWithStack(String input) {
		Stack stack = new Stack();
		StringBuffer returnStr= new StringBuffer();
		if (input == null || input.isEmpty()) {
			return input;
		}
		else{			 
			char el[]=input.toCharArray();  
			for(char a:el) {
				stack.push(a);
			}
			
			while ( !stack.isEmpty()) {
				returnStr.append(stack.pop());
	        }
			 
			//stack.stream().forEach(S -> returnStr.append(S));
		}
		return returnStr.toString();
	}
	public static boolean isPalindromStack(String text) {
		String reverse = reverseWithStack(text);
		System.out.println("text:"+text+",reverse:"+reverse);
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}
	
	/*
     * Java method to check if a number is palindrome or not
     */
    public static boolean isPalindromeNumber(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }


}





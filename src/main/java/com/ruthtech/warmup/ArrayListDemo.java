package com.ruthtech.warmup;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		System.out.println("Welcome to Java Program to find the length of array list");
		
		List<String> sam=List.of("","","");
		
		ArrayList<String> listOfBanks = new ArrayList<>();
		int size = listOfBanks.size();
		
		System.out.println("size of array list after creating: " + size);
		listOfBanks.add("Citibank");
		listOfBanks.add("Chase");
		listOfBanks.add("Bank of America");
		size = listOfBanks.size();
		
		System.out.println("length of ArrayList after adding elements: " + size);
		listOfBanks.clear();
		size = listOfBanks.size();
		System.out.println("size of ArrayList after clearing elements: " + size);
	}
}

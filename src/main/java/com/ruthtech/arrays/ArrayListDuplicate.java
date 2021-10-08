package com.ruthtech.arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListDuplicate{ 
	public static void main(String args[]){ // creating ArrayList with duplicate elements 
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2); 
		primes.add(3); 
		primes.add(5); 
		primes.add(7); 
		
		//duplicate 
		primes.add(7); 
		primes.add(11);
		
		// let's print arraylist with duplicate 
		System.out.println("list of prime numbers : " + primes); 
		
		// Now let's remove duplicate element without affecting order // LinkedHashSet will guaranteed the order and since it's set 
		// it will not allow us to insert duplicates. 
		// repeated elements will automatically filtered. 
		Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes); 
		// now let's clear the ArrayList so that we can copy all elements from LinkedHashSet 
		primes.clear();
		// copying elements but without any duplicates 
		primes.addAll(primesWithoutDuplicates); 
		System.out.println("list of primes without duplicates : " + primes); 
		
		System.out.println(" "+primes.stream().collect(Collectors.toSet()));
	}
	
}

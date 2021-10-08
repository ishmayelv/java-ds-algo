package com.ruthtech.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIsPalindromString() {
		assertEquals(true,Palindrome.isPalindromStack("aba"));
	}

	@Test
	void testIsPalindromStack() {
		//assertEquals(true,Palindrome.isPalindromStack("aba"));
		assertEquals(false,Palindrome.isPalindromStack("abaa"));
	}
	
	@Test
	void testIsPalindromeNumber() {
		assertEquals(true,Palindrome.isPalindromeNumber(1001));
	}

}

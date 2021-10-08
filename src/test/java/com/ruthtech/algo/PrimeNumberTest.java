package com.ruthtech.algo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.ruthtech.algo.PrimeNumber;

class PrimeNumberTest {

	@Test
	void testIsPrimeNumber() throws Exception {
		assertEquals(true,PrimeNumber.isPrimeNumber(2));
		assertNotEquals(true,PrimeNumber.isPrimeNumber(6));
	}
	

}

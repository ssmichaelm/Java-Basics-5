package com.ss.jb.five.tests.assignment2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.jb.five.assignment2.Assignment3Functional;

public class Assignment3Tests {
	Assignment3Functional myObj = new Assignment3Functional();
	
	// Test cases
	// Case 1 List of integers with positive
	/*
	 * Note that multiplying the MAX_VALUE of Integers by 2 returns -2
	 */
	List<Integer> posInt = Arrays.asList(100000, 28213, 31, 4533, 6, Integer.MAX_VALUE);
	List<Integer> posExpected = Arrays.asList(100000*2, 28213*2, 31*2, 4533*2, 6*2, Integer.MAX_VALUE*2);  
	
	// Case 2 List of integers with negative
	/*
	 * Note that multiplying the MIN_VALUE of Integers by 2 returns 0
	 */
	List<Integer> negInt = Arrays.asList(-100000, -28213, -31, -4533, -6, Integer.MIN_VALUE);
	List<Integer> negExpected = Arrays.asList(-100000*2, -28213*2, -31*2, -4533*2, -6*2, Integer.MIN_VALUE*2);

	// Case 3 Empty list of integers
	List<Integer> emptyInt = new ArrayList<>();
	
	@Test
	public void doubledTests() {
		assertEquals(posExpected, myObj.doubleIntegers(posInt));
		assertEquals(negExpected, myObj.doubleIntegers(negInt));
		assertEquals(emptyInt, myObj.doubleIntegers(emptyInt));
	}
}

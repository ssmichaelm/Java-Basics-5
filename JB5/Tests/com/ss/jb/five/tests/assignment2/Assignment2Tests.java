package com.ss.jb.five.tests.assignment2;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.jb.five.assignment2.Assignment2Functional;

public class Assignment2Tests {
	Assignment2Functional myObj = new Assignment2Functional();
	// Test cases
	// Case 1: list of positive Integers, with MAX Integer value
	List<Integer> posInt = Arrays.asList(100000, 28213, 31, 4533, 6, Integer.MAX_VALUE);
	List<Integer> posExpected = Arrays.asList(0, 3, 1, 3, 6, 7);
	// Case 2: list of negative Integers, with MIN Integer value
	List<Integer> negInt = Arrays.asList(-100000, -28213, -31, -4533, -6, Integer.MIN_VALUE);
	List<Integer> negExpected = Arrays.asList(-0, -3, -1, -3, -6, -8);

	// Case 3: list has no integers
	List<Integer> emptyInt = new ArrayList<>();
	
	@Test
	public void rightmostTests() throws Exception {
		assertEquals(posExpected, myObj.rightmostDigits(posInt));
		assertEquals(emptyInt, myObj.rightmostDigits(emptyInt));
	}
	
	@Test (expected = Exception.class)
	public void rightmostTestNeg() throws Exception {
		myObj.rightmostDigits(negInt);
	}
}

package com.ss.jb.five.tests.assignment2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.jb.five.assignment2.Assignment5Recursion;

public class Assignment5Tests {
	Assignment5Recursion myObj = new Assignment5Recursion();
	
	// Positive test cases
	// Case 1: positive Integers can reach target, NO GROUPING at all
	Integer[] posList = new Integer[] {1, 2, 3, 4};
	
	// Case 2: positive Integers can reach target, with grouping
	Integer[] posListGroup = new Integer[] {1, 2, 2, 1};

	// Case 3: positive Integers can reach target, with failed grouping
	Integer[] posListFailedGroup = new Integer[] {5, 2, 2, 1};

	// Case 4: positive Integers can't reach target, NO GROUPING at all
	Integer[] posListX = new Integer[] {1, 2, 3, 4};

	// Case 5: positive Integers can't reach target, with grouping
	Integer[] posListGroupX = new Integer[] {1, 2, 2, 1};

	// Case 6: positive Integers can't reach target, with failed grouping
	Integer[] posListFailedGroupX = new Integer[] {1, 2, 2, 2};

	
	// Negative test cases
	// Case 1: negative Integers can reach target, NO GROUPING at all
	Integer[] negList = new Integer[] {-1, -2, -3, -4};

	// Case 2: negative Integers can reach target, with grouping
	Integer[] negListGroup = new Integer[] {-1, -2, -2, -1};

	// Case 3: negative Integers can reach target, with failed grouping
	Integer[] negListFailedGroup = new Integer[] {-5, -2, -2, -1};
	
	// Case 4: negative Integers can't reach target, NO GROUPING at all
	Integer[] negListX = new Integer[] {-1, -2, -3, -4};

	// Case 5: negative Integers can't reach target, with grouping
	Integer[] negListGroupX = new Integer[] {-1, -2, -2, -1};

	// Case 6: negative Integers can't reach target, with failed grouping
	Integer[] negListFailedGroupX = new Integer[] {-1, -2, -2, -2};

	
	@Test
	public void positiveIntTests() {
		assertTrue(myObj.groupSumClumps(0, posList, 6));
		assertTrue(myObj.groupSumClumps(0, posListGroup, 6));
		assertTrue(myObj.groupSumClumps(0, posListFailedGroup, 6));
		
		assertFalse(myObj.groupSumClumps(0, posListX, 11));
		assertFalse(myObj.groupSumClumps(0, posListGroupX, 20));
		assertFalse(myObj.groupSumClumps(0, posListFailedGroupX, 2));
	}
	
	@Test
	public void negativeIntTests() {
		assertTrue(myObj.groupSumClumps(0, negList, -6));
		assertTrue(myObj.groupSumClumps(0, negListGroup, -6));
		assertTrue(myObj.groupSumClumps(0, negListFailedGroup, -6));
		
		assertFalse(myObj.groupSumClumps(0, negListX, -11));
		assertFalse(myObj.groupSumClumps(0, negListGroupX, -20));
		assertFalse(myObj.groupSumClumps(0, negListFailedGroupX, -2));
	}
}

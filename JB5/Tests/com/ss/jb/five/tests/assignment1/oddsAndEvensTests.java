package com.ss.jb.five.tests.assignment1;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import com.ss.jb.five.assignment1.oddsAndEvens;

public class oddsAndEvensTests {
	oddsAndEvens obj = new oddsAndEvens();
	
	// Case 1: positive Integer list
	List<Integer> intList = Arrays.asList(0, 1, 2, 3, 4, 5);
	// Case 2: negative Integers
	List<Integer> negList = Arrays.asList(-3, -2, -1);
	// Case 3: empty list
	List<Integer> emptyList = new ArrayList<>();
	// Case 4: List with wrong type (use null, i.e. no list exists at all or wrong type)
	
	@Test
	public void listTests() {
		assertEquals("e0, o1, e2, o3, e4, o5", obj.appendCharacters(intList));
		assertEquals("o-3, e-2, o-1", obj.appendCharacters(negList));
		assertEquals("", obj.appendCharacters(emptyList));
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void invalidListTest() {
		obj.appendCharacters(null);
	}
}

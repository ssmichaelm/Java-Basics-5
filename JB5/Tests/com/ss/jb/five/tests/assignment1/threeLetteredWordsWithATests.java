package com.ss.jb.five.tests.assignment1;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.ss.jb.five.assignment1.threeLetteredWordsWithA;

public class threeLetteredWordsWithATests {
	threeLetteredWordsWithA myObj = new threeLetteredWordsWithA();
	
	// Case 1: regular list that has words with 'a'
	List<String> stringList = Arrays.asList("aaa", "hello", "ax", "axe", "batch", "marshmallow", "that", "ama", "bye");
	List<String> expectedList = Arrays.asList("aaa", "axe", "ama");
	// Case 2: empty list
	List<String> emptyList = new ArrayList<>();
	// Case 3: null parameter

	@Test
	public void getStringsTests() {
		assertThat(myObj.getStrings(stringList), is(expectedList));
		assertThat(myObj.getStrings(emptyList), is(new ArrayList<>()));
	}
	
	@Test (expected = NullPointerException.class)
	public void getStringsNullInput() {
		assertNull(myObj.getStrings(null));
	}
}

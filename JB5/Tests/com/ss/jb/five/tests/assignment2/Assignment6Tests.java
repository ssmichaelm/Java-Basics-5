package com.ss.jb.five.tests.assignment2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.jb.five.assignment2.Assignment6Singleton;

public class Assignment6Tests {
	Assignment6Singleton myObj = Assignment6Singleton.getInstance();
	Assignment6Singleton myObj2 = Assignment6Singleton.getInstance();
	
	@Test
	public void singletonTests() {
		assertEquals(myObj.hashCode(), myObj2.hashCode()); // Equal hash codes means the singleton was implemented correctly
	}
}

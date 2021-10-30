package com.ss.jb.five.assignment1;

import java.util.List;

import com.ss.jb.five.assignmentinterface.FunctionalInterface;

public class oddsAndEvens {
	/*
	 * This method takes a list of Integers, then:
	 * - Checks if each element is odd or even
	 * - Appends the appropriate character to the element in a StringBuilder
	 * Returns the completed string
	 */
	public String appendCharacters (List<Integer> intList) throws IllegalArgumentException {
		if(intList == null)
			throw new IllegalArgumentException("List was null!");
		
		StringBuilder sb = new StringBuilder();
		int listSize = intList.size();
	
		FunctionalInterface ft = (x) -> x % 2 != 0; // If the integer is odd
		
		for (int i = 0; i < listSize; i++) {
			// If the integer is odd
			if (ft.isTrue(intList.get(i))) {
				sb.append('o').append(intList.get(i));
			}
			// If the integer is even
			else {
				sb.append('e').append(intList.get(i));
			}
			
			// Append a comma after each element besides the last
			if (i < listSize - 1)
				sb.append(',').append(' ');
		}
		
		System.out.println("Appended 'e' to even integers and 'o' to odd");
		return sb.toString();
	}
}

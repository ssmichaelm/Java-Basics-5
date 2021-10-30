package com.ss.jb.five.assignment1;

import java.util.List;
import java.util.stream.Collectors;

import com.ss.jb.five.assignmentinterface.FunctionalInterface;

public class threeLetteredWordsWithA {
	/*
	 * This method takes a list of Strings, then:
	 * - Utilizes a functional interface, streams, and lambda utility to find the strings in the list that
	 *   contain the lower-case 'a' and have exactly three letters
	 * Returns the modified list containing all strings that fit the criteria
	 */
	public List<String> getStrings (List<String> strings) throws NullPointerException {
		if (strings == null)
			throw new NullPointerException("list was null");
		
		System.out.println("\nWords in the sentence that contain the lower-case 'a' and have three letters");
		FunctionalInterface ft = (x) -> x == 3;
		
		List<String> modifiedList = strings.stream()
			.filter(s -> s.contains("a"))
			.filter((s) -> ft.isTrue(s.length()))
			.collect(Collectors.toList());
		
		return modifiedList;
	}
}

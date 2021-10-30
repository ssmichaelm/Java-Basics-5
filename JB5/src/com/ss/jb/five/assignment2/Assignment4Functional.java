package com.ss.jb.five.assignment2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment4Functional implements Utility<String> {
	public static void main(String[] args) {
		Assignment4Functional myObj = new Assignment4Functional();
		
		List<String> strings = myObj.populateList();
		System.out.println("Initial list");
		myObj.printList(strings);
		System.out.println("\nAfter removing x's");
		myObj.removeX(strings);
	}

	/*
	 * This is a void method that utilizes streams to map strings with their 'x' characters removed (really replaced with '')
	 * Then prints each one
	 */
	public void removeX (List<String> strings) {
		strings.stream()
					.map(s -> s.replace("x", "")).collect(Collectors.toList()).forEach((s) -> System.out.print(s + " "));;
	}
	
	@Override
	public void printList(List<String> strings) {
		// TODO Auto-generated method stub
		for(String s: strings) {
			System.out.printf("%s ", s);
		}
		System.out.println();
	}

	@Override
	public List<String> populateList() {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("xxax", "xbxbx", "xxcx", "ax", "bb", "cx", "x");
		return strings;
	}
}

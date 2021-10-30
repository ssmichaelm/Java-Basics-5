package com.ss.jb.five.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment3Functional implements Utility<Integer> {
	public static void main(String args[]) {
		Assignment3Functional myObj = new Assignment3Functional();
		
		List<Integer> intList = myObj.populateList();
		List<Integer> doubledList = myObj.doubleIntegers(intList);
		
		myObj.printList(intList);
		myObj.printList(doubledList);
	}
	
	/*
	 * This method takes a list of Integers and returns a list of Integers containing each int from the input list but doubled
	 */
	public List<Integer> doubleIntegers(List<Integer> intList) {
		List<Integer> doubledIntList = new ArrayList<Integer>();
		for(int i: intList) {
			doubledIntList.add(i * 2);
		}

		return doubledIntList;
	}

	@Override
	public void printList(List<Integer> intList) {
		// TODO Auto-generated method stub
		for(int i: intList) {
			System.out.printf("%4d ", i);
		}
		System.out.println();
	}

	@Override
	public List<Integer> populateList() {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 7; i++) {
			intList.add((int)(Math.random() * (1000)) + 1);
		}
		
		return intList;
	}
}

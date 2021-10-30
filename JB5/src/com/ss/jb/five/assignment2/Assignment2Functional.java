package com.ss.jb.five.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment2Functional implements Utility<Integer> {
	public static void main(String args[]) {
		Assignment2Functional myObj = new Assignment2Functional();
		
		try {
			List<Integer> intList = myObj.populateList();
			List<Integer> rightmostDigitList = myObj.rightmostDigits(intList);
			
			myObj.printList(intList);
			myObj.printList(rightmostDigitList);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * This method takes a list of non-negative Integers and...
	 * Returns a list of Integers that are the last digits of the input Integers
	 */
	public List<Integer> rightmostDigits(List<Integer> intList) throws Exception {
		List<Integer> integers = new ArrayList<Integer>();
		
		// For each integer, add the rightmost digit to the list we're returning
		for(int i: intList) {
			
			// The Integer list will never have negative values, but as a safeguard for errors
			if(i < 0)
				throw new Exception("Integer not positive");
			
			integers.add(i % 10);
		}

		return integers;
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

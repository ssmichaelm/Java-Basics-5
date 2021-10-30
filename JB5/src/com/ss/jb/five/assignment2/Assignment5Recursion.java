package com.ss.jb.five.assignment2;

import java.util.ArrayList;
import java.util.List;

public class Assignment5Recursion {
	public static void main(String[] args) {
        Assignment5Recursion myObj = new Assignment5Recursion();
        
        List<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 6; i++) {
			intList.add((int)(Math.random() * (16)) + 1);
		}
		Integer nums[] = new Integer[intList.size()];
		intList.toArray(nums);
        
		int target1 = (int)(Math.random() * (35)) + 10; 
		int target2 = (int)(Math.random() * (35)) + 10;
		
		System.out.println("Target: " + target1);
		for(Integer i: nums) {
			System.out.printf("%d ", i);
		}
		System.out.printf("-> %s", myObj.groupSumClumps(0, nums, target1));
		

		System.out.println("\n\nTarget: " + target2);
		for(Integer i: nums) {
			System.out.printf("%d ", i);
		}
		System.out.printf("-> %s", myObj.groupSumClumps(0, nums, target2));
		
	}
	
	/*
	 * This method recursively takes a beginning iterator, an array of Integers, and a target.
	 * Returns false to break out of recursion (like when reaching the end)
	 * Otherwise returns true if there is still a possibility for the values in the array to reach the target
	 */
	public boolean groupSumClumps (int beginning, Integer[] intArray, int target) {
		int groupSum = 0;
		int intIterator = beginning; // Initialize the array iterator as the passed beginning

		// If the int array has nothing left, target must be 0
		if (beginning >= intArray.length) {
			return (target == 0);
		}
		
		while(intIterator < intArray.length) {
			// If adjacent values equal each other, add them to the groupSum
            if (intArray[beginning] == intArray[intIterator]) {
                groupSum += intArray[intIterator];
            }
            else 
                break;
            intIterator++;
		}
		
		// Recursively call the function with a new beginning and/or an altered target
		int newBeginning = intIterator; 
		
		// We subtract the groupSum (if any) from the target to update the target
		// This means the remaining values in the array that aren't apart of the groupSum just need to reach the new target
		if (groupSumClumps(newBeginning, intArray, target - groupSum))  
			return true;
		if (groupSumClumps(newBeginning, intArray, target))
			return true;

		return false;
	}
}

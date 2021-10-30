package com.ss.jb.five.assignment2;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ss.jb.five.assignmentinterface.FunctionalInterface;

public class Assignment1Lambdas {
	public static void main(String[] args) {
		Assignment1Lambdas myObj = new Assignment1Lambdas();
		
		try (Scanner scanner = new Scanner(System.in)){
			int integerCount = scanner.nextInt();
			int[] intTypes = new int[integerCount];
			int[] testNumbers = new int[integerCount];
			
			// First user inputs all their input
			for(int i = 0; i < integerCount; i++) {
				intTypes[i] = scanner.nextInt();
				testNumbers[i] = scanner.nextInt();
			}
			
			// After the user inputs their integers, goes to a switch, then spit out the results
			for(int i = 0; i < integerCount; i++) {
				myObj.operationSwitch(intTypes[i], testNumbers[i]);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}

	}
	
	/*
	 * This method is a switch that checks the check type (the first integer of the row) and :
	 * - has a case 1: which calls the function checkInt, which utilizes the functional interface isOdd()
	 * - has a case 2: which calls the function checkInt, which utilizes the functional interface isPrime()
	 * - has a case 3: which calls the function checkInt, which utilizes the functional interface isPalindrome()
	 */
	public void operationSwitch(int intType, int x) {
		checkInteger integerChecker = new checkInteger();

		switch (intType) {
			// Case 1: check if odd
			case 1:
				if(checkInteger.checkInt(integerChecker.isOdd(), x))
						System.out.print("Odd\n");
				else
					System.out.print("Even\n");
				break;
			// Case 2: check if prime
			case 2:
				if(checkInteger.checkInt(integerChecker.isPrime(), x))
					System.out.print("Prime\n");
				else
					System.out.print("Composite\n");
				break;	
			// Case 3: check if palindrome
			case 3:
				if(checkInteger.checkInt(integerChecker.isPalindrome(), x))
					System.out.print("Palindrome\n");
				else
					System.out.print("Not palindrome\n");
				break;
		}
	}	
}

class checkInteger {
	public static boolean checkInt(FunctionalInterface ft, int x) {
		return ft.isTrue(x); // Return true if the int is odd, prime, or palindrome (depending on what method)
	}
	
	FunctionalInterface isOdd() {
		return (i) -> i % 2 != 0;
	} 
		
	FunctionalInterface isPrime() {
		return (i) -> {
			boolean flag = false;
			for(int temp = 2; temp <= i / 2; ++temp) {
				// If the integer is divisible by anything other than itself or 1, it isn't prime
				if (i % temp == 0) {
					flag = false;
					break;
				}
				else
					flag = true;
			}
			return flag;			
		};
	}
	
	/*
	 * The logic here is that StringBuffers offer a reverse() method. Thus, rather than 
	 * more awkwardly dealing with an integer directly...
	 * We convert the int to a string, then create a StringBuffer object from what string, reverse it, then convert it back to a string.
	 */
	FunctionalInterface isPalindrome() {
		return (x) -> {
			String str = x.toString();
			String backwardsStr = new StringBuffer(str).reverse().toString();
			
			return str.equals(backwardsStr);
		};
	}
}
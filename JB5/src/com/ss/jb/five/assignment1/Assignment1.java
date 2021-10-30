package com.ss.jb.five.assignment1;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		String[] sentence = {"My", "name", "is", "Michael", "Moreland", "and", "I", "want", "to", "be", "a", "software", "engineer"};

		// Part 1: Sort sentence by various sorts, using streams and Helper methods
		basicLambdaSorting sortingObj = new basicLambdaSorting();
		sortingObj.sortSentence(sentence);
		
		// Part 2: Append the correct character to a given Integer
		oddsAndEvens oddsAndEvensObj = new oddsAndEvens();		
		List<Integer> intList = new ArrayList<>();
		for(int i = 0; i < 10; i++)
			intList.add((int)(Math.random() * (50)) + 0);

		System.out.println(oddsAndEvensObj.appendCharacters(intList));
		
		// Part 3: Get all strings in a given list of strings that have the letter 'a' and have three letters
		threeLetteredWordsWithA threeLetteredWordsWithAObj = new threeLetteredWordsWithA();
		List<String> listostrings = Arrays.asList(sentence);
		for(String s: threeLetteredWordsWithAObj.getStrings(listostrings)) {
			System.out.println(s);
		}
		
		// Part 4: Date and time methods
		DateTimeMethods dateTimeObject = new DateTimeMethods();
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("\nEnter a year to view the lengths of each  month within that year: ");
			int userYear = scanner.nextInt();
			dateTimeObject.reportDays(userYear);
			
			System.out.println("\nEnter a month (1-12) to view all of the Mondays in that month: ");
			int userMonth = scanner.nextInt();
			dateTimeObject.listAllMondays(YearMonth.of(userYear, userMonth), YearMonth.of(userYear, userMonth).lengthOfMonth());
			
			System.out.println("\nWith the previously input year and month, please input a day (1-31) to see if it is/was Friday the 13th: ");
			int userDay = scanner.nextInt();
			LocalDate userDate = LocalDate.of(userYear, userMonth, userDay);
			if (dateTimeObject.isFriday13th(userDate))
				System.out.println(userDate + " is/was a Friday the 13th!");
			else
				System.out.println(userDate + " isn't/wasn't a Friday the 13th!");
				
		} catch (InputMismatchException e) {
			System.out.println("Invalid input");
		}
	}
	
}

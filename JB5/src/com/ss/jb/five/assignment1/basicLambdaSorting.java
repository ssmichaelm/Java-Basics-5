package com.ss.jb.five.assignment1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class basicLambdaSorting {
	/*
	 * This method calls sorting methods that sort and print the initial sentence first with streams 
	 * and next with helper methods
	 */
	public void sortSentence (String[] sentence) {
		List<String> sentenceList = Arrays.asList(sentence);
		
		System.out.println("Sorted sentence by: ");

		ascendingLength(sentence, sentenceList);
		descendingLength(sentence, sentenceList);
		alphabetical(sentence, sentenceList);
		containingE(sentence, sentenceList);
	}
	
	/*
	 * This method sorts an array of strings by their length from shortest to longest
	 */
	public void ascendingLength (String[] sentence, List<String> sentenceList) {
		// Sort the array using streams
		System.out.print("Ascending word length \n");
		sentenceList.stream()
			.sorted(Comparator.comparingInt(s -> s.length()))
			.collect(Collectors.toList())
			.forEach((str) -> System.out.print(str + " "));
		System.out.print("[with Streams] \n");
		
		// Sort the array by helper method
		Arrays.sort(sentence, (s1, s2) -> Helpers.ascendingSort(s1, s2));
		for(String s: sentence) {
			System.out.print(s + " ");
		}
		System.out.print("[with Helper method] \n\n");
	}
	
	/*
	 * This method sorts an array of strings by their length from longest to shortest
	 */
	public void descendingLength (String[] sentence, List<String> sentenceList) {
		System.out.print("Descending word length \n");
		sentenceList.stream()
			.sorted( Comparator.comparingInt(s -> ((String) s).length() ) .reversed() )
			.collect(Collectors.toList())
			.forEach((str) -> System.out.print(str + " "));
		System.out.print("[with Streams] \n");
		
		Arrays.sort(sentence, (s1, s2) -> Helpers.descendingSort(s1, s2));
		for(String s: sentence) {
			System.out.print(s + " ");
		}
		System.out.print("[with Helper method] \n\n");
	}
	
	/*
	 * This method sorts an array of strings in alphabetical order, by their first character
	 */
	public void alphabetical (String[] sentence, List<String> sentenceList) {
		System.out.print("Alphabetical by first character \n");
		sentenceList.stream()
			.sorted(Comparator.comparing(s -> Character.toLowerCase(s.charAt(0))))
			.collect(Collectors.toList())
			.forEach((str) -> System.out.print(str + " "));
		System.out.print("[with Streams] \n");
		
		Arrays.sort(sentence, (s1, s2) -> Helpers.alphabeticalSort(s1, s2));
		for(String s: sentence) {
			System.out.print(s + " ");
		}
		System.out.print("[with Helper method] \n\n");
	}
	
	/*
	 * This method sorts an array of strings sorted with those containing the letter 'e' appearing first
	 */
	public void containingE (String[] sentence, List<String> sentenceList) {
		System.out.print("Words what contain 'e' appear first \n");
		sentenceList.stream()
			.sorted(Comparator.comparingInt(s -> (s.contains("e") || s.contains("E") ? 0 : 1) ))
			.collect(Collectors.toList())
			.forEach((str) -> System.out.print(str + " "));
		System.out.print("[with Streams] \n");
		
		Arrays.sort(sentence, (s1, s2) -> Helpers.containsESort(s1, s2));
		for(String s: sentence) {
			System.out.print(s + " ");
		}
		System.out.print("[with Helper method] \n\n");
	}
}

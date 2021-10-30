package com.ss.jb.five.assignment1;

public class Helpers {
	public static Integer ascendingSort (String word1, String word2) {
		return word1.length() - word2.length();
	}
	
	public static Integer descendingSort (String word1, String word2) {
		return word2.length() - word1.length();
	}
	
	public static Integer alphabeticalSort (String word1, String word2) {
		return (int) (Character.toLowerCase(word1.charAt(0)) - Character.toLowerCase(word2.charAt(0)));
	}
	
	public static Integer containsESort (String word1, String word2) {
		return (int) (word1.contains("e") || word1.contains("E") ? 0 : 1) - (word2.contains("e") || word2.contains("E") ? 0 : 1);
	}
}

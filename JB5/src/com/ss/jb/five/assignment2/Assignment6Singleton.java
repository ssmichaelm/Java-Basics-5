package com.ss.jb.five.assignment2;


/*
 * This revised singleton:
 * - Removed unnecessary imports of packages
 * - Removed the variable "conn". This variable could have been accessed by m
 * - Added the "volatile" keyword to the static singleton instance
 * - Implemented visibility ("volatile" and "synchronized") and the ability block other threads ("synchronized")
 * - Adds double locking
 */
public class Assignment6Singleton {
	
	private volatile static Assignment6Singleton instance = null;
	
	private Assignment6Singleton() {};
	
	public static Assignment6Singleton getInstance() {
		// Single check
		if (instance == null) {
			synchronized(Assignment6Singleton.class) {
				
				// Double check
				if(instance == null)
					instance = new Assignment6Singleton();
			}
		}
		return instance;
	}
	
}

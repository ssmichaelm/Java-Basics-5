package com.ss.jb.five.assignment1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class DateTimeMethods {
	/*
	 * This method takes a given year and reports the length of each month within that year
	 */
	public void reportDays(int year) {
		for(int i = 1; i <= 12; i++) {
			YearMonth currentMonth = YearMonth.of(year, i);
			System.out.printf("%s %d has: %d days \n", 
								currentMonth.getMonth(), currentMonth.getYear(), currentMonth.lengthOfMonth());
		}	
	}
	
	/*
	 * This method takes a current month and it's length.
	 * It then lists all of the Mondays within that month.
	 * The year is determined by the year input by the user for reportDays()
	 */
	public void listAllMondays(YearMonth currentMonth, int monthLength) {
		LocalDate dateOfCurrMonth = currentMonth.atEndOfMonth().minusDays(monthLength - 1); // Initially get beginning of the month
		DayOfWeek firstDay = DayOfWeek.from(dateOfCurrMonth); // Get the weekday of the 1st of the month
		
		int differenceInDays = firstDay.compareTo(DayOfWeek.MONDAY);
		
		LocalDate mondayDate = null;
		
		// Difference can never be < 0 since Monday is (1). However, for safe checking
		if(differenceInDays < 0) {
			mondayDate = dateOfCurrMonth.minusDays(differenceInDays);
		}
		/* Else, when the difference is >= 0, meaning the first day of the month was Monday (difference = 0)...
		 * up to Sunday (difference = +6), we subtract 7 from the difference then subtract that new value from the current date.
		 * This gives us the first Monday of the month.
		 * 
		 * For example: say the first of March was Wednesday.
		 * 1. The difference would be 2 (Wednesday is 3 and Monday is 1, so 3-1 == 2)
		 * 2. The new difference would then be: difference = 2 - 7 == -5.
		 * 3. Subtracting -5 from the date of the current month (which is initialized as the 1st) gives us 
		 * 		March 6th. Because we subtracted by 7 in step 2, March 6th is Monday.
		 */
		else {
			differenceInDays -= 7;
			mondayDate = dateOfCurrMonth.minusDays(differenceInDays);
		}
		
		/* Since the date is now calibrated, just print the date and update the Monday date and current date by a week
		 * until the end of the month is reached
		 */
		do {
			System.out.println(mondayDate);
			
			mondayDate = mondayDate.plusWeeks(1);
			dateOfCurrMonth = dateOfCurrMonth.plusWeeks(1);
		}
		while(!dateOfCurrMonth.isAfter(currentMonth.atEndOfMonth()));
	}
	
	/*
	 * This method returns true if the given date is or was Friday the 13th
	 */
	public boolean isFriday13th(LocalDate givenDate) {
		if (givenDate.equals(LocalDate.of(givenDate.getYear(), givenDate.getMonth(), 13)) && givenDate.getDayOfWeek() == DayOfWeek.FRIDAY)
			return true;
		else
			return false;
	}
}

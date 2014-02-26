package com.companyname.col;

import java.util.Set;
import java.util.TreeSet;

enum Weekday
{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/**
 * As well as being more awkward to use (and verbose) than the bitset, the Set alternative requires
more memory to store each constant and is not as fast. Because of these problems, EnumSet was
introduced.
 *
 */
class DaysOff
{
	public static void main(String[] args)
	{
		Set<Weekday> daysOff = new TreeSet<>();
		daysOff.add(Weekday.WEDNESDAY);
		daysOff.add(Weekday.SUNDAY);
		daysOff.add(Weekday.MONDAY);
		System.out.println(daysOff);
	}
}
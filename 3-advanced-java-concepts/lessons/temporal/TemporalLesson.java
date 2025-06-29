package temporal;

import objects.ConsoleUI;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;


public class TemporalLesson {

	// know how to use the local time, local date, localdatetime classes
	//be able to use the of() method for these classes to create new dates
	// know how ot erate a date that is the current time
	// know how to format a date when printing it
	// calculate the amount of time between two time periods

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDate dateTime = LocalDate.from(LocalDateTime.now());

		System.out.println(today);
		System.out.println(time);
		System.out.println(dateTime);

		//LocalDate.of(year, month, day) to create a specific date
		LocalDate lastChristmasDay = LocalDate.of(2024,12,25);
		System.out.println(lastChristmasDay);

		// LocalTime.of(hour
		LocalTime naptime = LocalTime.of(17,30);
		System.out.println(naptime);

		//LocalDateTime.of(year, month, day, hour, minute)
		LocalDateTime someDateTime = LocalDateTime.of(2015, 11, 17, 12, 4);
		System.out.println(someDateTime);

		//formatting dates and times for printing
		DateTimeFormatter usDate = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //usDate with leading zero on month
		DateTimeFormatter usDateWithNoLeadingZero = DateTimeFormatter.ofPattern("M/dd/yyyy"); //usDate, no leading zero
		DateTimeFormatter usDateTime = DateTimeFormatter.ofPattern("MM/dd/yyyy h:mma");

		DateTimeFormatter dotDate = DateTimeFormatter.ofPattern("MM.dd.yyyy");
		DateTimeFormatter wordDate = DateTimeFormatter.ofPattern("EEEE dd, MMMM yyyy");

		System.out.println(today.format(usDate));
		System.out.println(lastChristmasDay.format(usDate));
		System.out.println(someDateTime.format(usDate));
		System.out.println(someDateTime.format(usDateWithNoLeadingZero));
		System.out.println(someDateTime.format(dotDate));
		System.out.println(someDateTime.format(wordDate));

		//adding/subtracting time
		System.out.println(today.format(usDate));
		//add one week to today and return it to a new LocalDate Object
		LocalDate nextWeek = today.plusWeeks(1);
		System.out.println(nextWeek.format(usDate));
		LocalDate modifiedDate = today.plusDays(3).plusWeeks(8);
		System.out.println(modifiedDate);

		//Calculating the amount of time between two LocalDateTime objects
		Duration daysUntil = Duration.between(today.atStartOfDay(), nextWeek.atStartOfDay());
		System.out.println("days until: " + modifiedDate.format(usDate) + " is " + daysUntil.toDaysPart());

		//calculate years, months, days between to dates
		//next haley's comet visit: july 28 2061
		LocalDate nextVisit = LocalDate.of(2061,7,28);

		Duration yearUntilVisit = Duration.between(today.atStartOfDay(), nextVisit.atStartOfDay());
		// for years/months/decades the .until() method would work better
		// Calculate Years, Months, days between to dates...
		// next haley's comet visit: July 28, 2061

		long yearsUntil = today.until(nextVisit, ChronoUnit.YEARS
		);   // get the number of years using .until()

		LocalDate todayPlusYears = LocalDate.now().plusYears(yearsUntil);           // add the number of years to today
		long monthsUntil = todayPlusYears.until(nextVisit, ChronoUnit.MONTHS
		);

		LocalDate todayPlusYearsAndMonths = todayPlusYears.plusMonths(monthsUntil);  // add the number of months
		long daysUntilVisit = todayPlusYearsAndMonths.until(nextVisit, ChronoUnit.
				DAYS
		);
		System.out.println("Time until next visit from haley's comet is "
				+ yearsUntil + " years, "
				+ monthsUntil
				+ " month, and "
				+ daysUntilVisit + " day");

		//built in enums for date checking

		if(today.getDayOfWeek().equals(DayOfWeek.FRIDAY)) {
			System.out.println("do daily tasks");
			System.out.println("do end of week task");
		} else {
			System.out.println("do daily tasks");
		}
		System.out.println("current month of SomeDateTimr is: " + someDateTime.getMonth());
		if(someDateTime.getMonth().equals(Month.NOVEMBER)){
			System.out.println("yay the best month");
		}

		//parsing a date from String
		//this is a good
		DateTimeFormatter parsingFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String userInput = ConsoleUI.getString("enter the next holiday: \n>>>");
		LocalDate nextHoliday = LocalDate.parse(userInput, usDate);
		System.out.println("the next holiday is " + nextHoliday.format(usDate) + " which is a " +nextHoliday.getDayOfWeek());

		// maybe a loop to show how to iterate from a time to naother over and over

		ArrayList<String> patients = new ArrayList<>();
		patients.add("bubba");
		patients.add("ginger");
		patients.add("jenny");
		patients.add("pete");

		LocalTime schedule = LocalTime.of(8,0);
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mma");
		System.out.println("\nmorning patient list: ");
		for(String patient : patients) {
			System.out.println(schedule.format(timeFormat));
			schedule = schedule.plusMinutes(45);
			System.out.println(schedule.format(timeFormat) + ":" + patient);
		}
	}
}